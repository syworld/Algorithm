import sys

sys.stdin = open("in1.txt", "rt")
# 뒤집은 숫자가 소수인지 여부 출력
n = int(input())
a = list(map(int, input().split()))


def reverse(x):
    res = 0
    while x > 0:
        res = res * 10 + (x % 10)
        x = x // 10

    return res


def is_prime(x):
    if x == 1:
        return False
    for i in range(2, x // 2 + 1):
        if x % i == 0:
            return False
    else:
        return True


for x in a:
    tmp = reverse(x)
    if is_prime(tmp):
        print(tmp, end=' ')
