import unittest


class TestReversedString(unittest.TestCase):

    def test_reverse_string(self):
        given_str = "the sky is blue"
        expected = "blue is sky the"
        result = reverse_string(given_str)
        self.assertEqual(expected, result)

    def test_verbose_reverse(self):
        given_str = "the sky is blue"
        expected = "blue is sky the"
        result = verbose_reverse(given_str)
        self.assertEqual(expected, result)


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