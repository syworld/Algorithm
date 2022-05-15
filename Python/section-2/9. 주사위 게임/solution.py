import sys

sys.stdin = open("in1.txt", "rt")
n = int(input())
prices = [0] * n

for i in range(n):
    a, b, c = map(int, input().split())
    if a == b and b == c:
        prices[i] = 10000 + a * 1000
    elif a == b or a == c:
        prices[i] = 1000 + a * 100
    elif b == c:
        prices[i] = 1000 + b * 100
    else:
        prices[i] = max(a, b, c) * 100

print(max(prices))

       
# a, b, c = map(int, input().split())
# if a == b == c:
#     sum = 10000 + a * 1000
# elif a == b:
#     sum = 1000 + a * 100
# elif b == c:
#     sum = 1000 + b * 100
# elif c == a:
#     sum = 1000 + a * 100
#
# else:
#     sum = max(a, b, c) * 100
# if tot < sum:
#     tot = sum
#