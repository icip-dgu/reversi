import unittest


class TestReversedString(unittest.TestCase):

    string_testcase_1 = "the sky is blue"
    string_testcase_2 = "     the    sky is    blue      "
    expected = "blue is sky the"

    def test_reverse_string(self):
        result_t1 = reverse_string(self.string_testcase_1)
        result_t2 = reverse_string(self.string_testcase_2)
        self.assertEqual(self.expected, result_t1)
        self.assertEqual(self.expected, result_t2)

    def test_verbose_reverse(self):
        result_t1 = verbose_reverse(self.string_testcase_1)
        result_t2 = verbose_reverse(self.string_testcase_2)
        self.assertEqual(self.expected, result_t1)
        self.assertEqual(self.expected, result_t2)


def reverse_string(str):
    # split() method makes the string into list ['the', 'sky', 'is', 'blue']
    # using slicing syntax([::-1]) to make a copy of the same list in reverse order
    # join those reversed items in the list to string by using join() method
    # leading space is removed automatically by join method
    reversed_str = " ".join(str.split()[::-1])
    return reversed_str


def verbose_reverse(str):
    temp = str.split()
    temp.reverse()
    return " ".join(temp)


if __name__ == '__main__':
    unittest.main()