
def hello(name):
    if name == 'quit':
        return "Bye-bye"
    else:
        return "Hello, " + name + ", nice to meet you!"


if __name__ == '__main__':
    name = input("What is your name?")
    print hello(name)