import sys

sys.stdin = open("in1.txt", "rt")
n = int(input())
a = list(map(int, input().split()))
max = -2147000000


def digit_sum(x):
    sum = 0
    # for i in str(x):  # int는 not iterable
    #     sum += int(i)

    while x > 0:
        sum += x % 10
        x = x // 10
    return sum


for x in a:
    tot = digit_sum(x)
    if tot > max:
        max = tot
        res = x

print(res)
