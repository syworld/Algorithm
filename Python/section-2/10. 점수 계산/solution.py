import sys

sys.stdin = open("in1.txt", "rt")
n = int(input())
a = list(map(int, input().split()))
res = [0] * n

before = 0
for i in range(n):
    if a[i] == 1:
        res[i] = before + 1
    elif a[i] == 0:
        res[i] = 0
    before = res[i]

print(sum(res))


# Another Solution
# sum = 0
# cnt = 0
# for x in a:
#     if x == 1:
#         cnt += 1
#         sum += cnt
#     else:
#         cnt = 0
# print(sum)
