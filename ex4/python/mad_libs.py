import random

context = [
    "Do you {verb} your {adjective} {noun} {adverb}",
]


def mad_libs(base, noun, verb, adjective, adverb):
    mapped = {'noun':noun, 'verb':verb, 'adjective':adjective, 'adverb':adverb}
    return base.format_map(mapped)


if __name__=="__main__":
    if len(context) is 0:
        raise ValueError("context is empty")
    _base = random.shuffle(context)
    _noun = input("Enter a noun:")
    _verb = input("Enter a verb:")
    _adjective = input("Enter a adjective:")
    _adverb = input("Enter a adverb:")
    print(mad_libs(_base, _noun, _verb, _adjective, _adverb))
