import unittest
import print_quote


class TestCountStringLen(unittest.TestCase):
    def test_print_quote(self):
        self.assertEqual(print_quote.print_quote("a", "b"), "a, \"b\"");



if __name__ == '__main__':
    unittest.main()