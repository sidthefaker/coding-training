def print_quote(speaker, words):
    return speaker + ", \"" + words + ".\""


if __name__ == '__main__':
    words = raw_input("What is the quote?")
    speaker = raw_input("Who said is?")
    print print_quote(speaker, words)
