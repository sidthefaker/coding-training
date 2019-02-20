import os
import unittest
import sys
from unittest import TestSuite, TextTestResult, TestResult


def get_scripts():
    tests = []
    filters = ('venv', '.gradle', '__pycache__')
    for (path, dir, files) in os.walk(os.getcwd()):
        ignore = False
        for filter in filters:
            if filter in path:
                ignore = True

        if not ignore:
            for filename in files:
                if filename in ('__init__.py', 'run_alltest.py'):
                    continue
                if filename[-3:] == '.py':
                    # print(filename)
                    # print(path)
                    tests.append((path, filename[:-3]))
    return tests


def load_tests(testcases):
    suite = TestSuite()
    loader = unittest.defaultTestLoader
    for testcase in testcases:
        # print(testcase)
        tests = loader.loadTestsFromName(testcase)
        # print(tests)
        suite.addTests(tests)
    return suite


def print_result(result_type: str, results: list):
    if len(results) > 0:
        print('========================================')
        print(" {}... {}".format(result_type, len(results)))
        print('========================================')
        idx = 0
        for result in results:
            if idx != 0:
                print("----------------------------------------")
            print("{} test: {}".format(result_type, (result[0])))
            print(result[1])
        print('========================================')


if __name__ == '__main__':
    scripts = get_scripts()
    # print(scripts)

    testcases = []
    for script in scripts:
        # print(script)
        sys.path.append(script[0])
        exec('import ' + script[1])
        if '_test' in script[1]:
            # print(script[1])
            testcases.append(script[1])

    suites = load_tests(testcases)
    result = suites.run(TextTestResult(sys.stdout, False, 1))
    print(result)
    print_result("Error", result.errors)
    print_result("Failure", result.failures)

