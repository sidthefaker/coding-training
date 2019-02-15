def print_quote(speaker, words):
    return speaker + ", \"" + words + ".\""


if __name__ == '__main__':
    history = {}
    while True:
        words = input("What is the quote?")
        if words == "q": break;

        speaker = input("Who said is?")
        if speaker == "q": break

        if speaker not in history:
            history[speaker] = []
        history[speaker].append(words)

        for s, ws in history.items():
            for w in ws:
                print(print_quote(s, w))

