def print_quote(speaker, words):
    return speaker + ", \"" + words + ".\""


if __name__ == '__main__':
    history = {}
    while True:
        words = raw_input("What is the quote?")
        if words == "q": break;

        speaker = raw_input("Who said is?")
        if speaker == "q": break

        if not history.has_key(speaker):
            history[speaker] = []
        history[speaker].append(words)

        for s, ws in history.iteritems():
            for w in ws:
                print print_quote(s, w)

