import unittest
import count_string_len


class TestCountStringLen(unittest.TestCase):
    def test_count(self):
        test_msg = "testtesttest"
        self.assertEqual(count_string_len.count_string_len(test_msg), len(test_msg), "invalid length")

    def test_zero_string(self):
        with self.assertRaises(count_string_len.ZeroStringError):
            count_string_len.count_string_len("")