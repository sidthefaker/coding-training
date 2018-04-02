def count_string_len(string):
    pass


class ZeroStringError(ValueError):
    '''input string must not be 0'''


if __name__ == '__main__':
    string = input("What is the input string?")
    print string + " has " + str(count_string_len(string)) + " characters."
