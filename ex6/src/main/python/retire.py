import datetime

remain_retire_format = "You have {} years left util you can retire.\nIt's {}, so you can retire in {}"
retired_format = "You have already retired since {}. It's {}, so {} years passed after your retirement."


def calculate_retirement(curr_age:int, retire_age:int):
    remain = retire_age - curr_age
    curr_year = int(datetime.date.today().year)
    retire_year = curr_year + remain
    if remain > 0:
        return remain_retire_format.format(remain, curr_year, retire_year)
    else:
        return retired_format.format(retire_year, curr_year, -remain)


if __name__ == '__main__':
    curr_age = input("What is your current age?")
    retire_age = input("At what age would you like to retire?")
    print(calculate_retirement(int(curr_age), int(retire_age)))
