import sys

sys.stdin = open("in1.txt", "rt")
n, k = map(int, input().split())
a = list(map(int, input().split()))

# 3개 임의로 뽑아 중복 방지해서 저장
res = set()
for i in range(n):
    for j in range(i + 1, n):
        for t in range(j + 1, n):
            res.add(a[i] + a[j] + a[t])

res = list(res)
res.sort(reverse=True)
print(res[k - 1])