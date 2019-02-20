import unittest
import calculator


class TestCalculator(unittest.TestCase):
    def test_calc(self):
        a = 10
        b = 5
        result = calculator.calculate(a, b)
        self.assertEqual(a + b, result[0], "Invalid result for add")
        self.assertEqual(a - b, result[1], "Invalid result for subtract")
        self.assertEqual(a * b, result[2], "Invalid result for multiply")
        self.assertEqual(a / b, result[3], "Invalid result for divide")

    def test_not_number_input(self):
        try :
            calculator.calculate("5", "43")
            self.fail("Value error must be occurred")
        except TypeError as e:
            self.assertIn("Invalid value type: ", e.args[0], "A raised exception is not expected.:{}".format(e))
        except Exception as e:
            self.fail("A raised exception is not expected.:{}".format(e))

    def test_negative_value(self):
        try :
            calculator.calculate(-1,0)
            self.fail("Value error must be occurred")
        except ValueError as e:
            self.assertIn("negative value is not allowed: ", e.args[0], "A raised exception is not expected.:{}".format(e))
        except Exception as e:
            self.fail("A raised exception is not expected.:{}".format(e))


if __name__ == '__main__':
    unittest.main()
