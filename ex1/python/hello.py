
def hello(name):
    if name == 'quit':
        return "Bye-bye"
    else:
        return "Hello, " + name + ", nice to meet you!"


if __name__ == '__main__':
    print hello(raw_input("What is your name?"))