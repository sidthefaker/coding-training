import unittest
import hello


class TestHello(unittest.TestCase):
    def test_hello(self):
        self.assertEqual(hello.hello("Brian"), "Hello, Brian, nice to meet you!", "invalid result in normal case")

    def test_byebye(self):
        self.assertEqual(hello.hello("quit"), "Bye-bye", "\'quit\' command is not accepted")

if __name__ == '__main__':
    unittest.main()