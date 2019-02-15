import unittest
import mad_libs


class TestMadLibs(unittest.TestCase):
    def test_mad_libs(self):
        base = "{noun}, {adjective}, {adverb}, {verb}"
        result = mad_libs.mad_libs(base, "a", "b", "c", "d")
        self.assertEqual("a, c, d, b", result, "mapping failed: " + result)


if __name__ == '__main__':
    unittest.main()
