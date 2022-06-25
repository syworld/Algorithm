# 입력값 〉	["119", "97674223", "1195524421"]
# 기댓값 〉	false

def solution(phone_book):
    answer = True
    hash_map = dict()

    for phone in phone_book:
        hash_map[phone] = 1

    for phone in phone_book:
        tmp = ""
        for number in phone:
            tmp += number
            if (tmp in hash_map) and (tmp != phone):
                answer = False
    return answer


def solution2(phone_book):
    phone_book.sort()

    for p1, p2 in zip(phone_book, phone_book[1:]):
        if p2.startswith(p1):
            return False
    return True