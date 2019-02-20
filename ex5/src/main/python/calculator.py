def calculate(arg1: int, arg2: int):
    if type(arg1) is not int:
        raise TypeError("Invalid value type: {}".format(arg1))
    if type(arg2) is not int:
        raise TypeError("Invalid value type: {}".format(arg2))
    if arg1 < 0:
        raise ValueError("negative value is not allowed: arg1={}".format(arg1))
    if arg2 < 0:
        raise ValueError("negative value is not allowed: arg2={}".format(arg1))
    return arg1 + arg2, arg1 - arg2, arg1 * arg2, arg1 / arg2


if __name__ == '__main__':
    first = input("What is the first number?")
    second = input("What is the second number?")
    result = calculate(int(first), int(second))
    print("{0} + {1} = {2}\n{0} - {1} = {3}\n{0} * {1} = {4}\n{0} / {1} = {5}".format(first, second, result[0], result[1], result[2], result[3]))
