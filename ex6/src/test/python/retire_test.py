import unittest
import datetime

import retire


class TestRetire(unittest.TestCase):
    def test_cal_retire(self):
        curr_year = int(datetime.date.today().year)
        expected = retire.remain_retire_format.format(40, curr_year, curr_year + 40)
        output = retire.calculate_retirement(25, 65)
        self.assertEqual(output, expected)

    def test_already_retire(self):
        output = retire.calculate_retirement(70, 65)
        curr_year = int(datetime.date.today().year)
        expected = retire.retired_format.format(curr_year - 5, curr_year, 5)
        self.assertEqual(output, expected)
