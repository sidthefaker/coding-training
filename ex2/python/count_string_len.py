def count_string_len(input_str):
    if input_str is None or len(input_str) == 0: # todo:find efficient way
        raise ZeroStringError
    return len(input_str)


class ZeroStringError(ValueError):
    '''input string must not be 0'''


if __name__ == '__main__':
    while (True):
        try :
            input_str = raw_input("What is the input string?")
            print input_str + " has " + str(count_string_len(input_str)) + " characters."
            break
        except (SyntaxError, ZeroStringError):
            print "Please, input anything"
