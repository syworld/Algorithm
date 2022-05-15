import sys

sys.stdin = open("in1.txt", "rt")
# 정 n면체 + 정 m면체 던져서 나오는 눈의 합 중 가장 확률이 높은 숫자 출력
n, m = map(int, input().split())


#cnt 합의 값 list -> 가장 높은 값을 갖는 index 출력
cnt = [0]*(n+m+1)
max = -2147000000

for i in range(1, n + 1):
    for j in range(1, m + 1):
        cnt[i + j] += 1

for i in range(n+m+1):
    if cnt[i]>max:
        max = cnt[i]

for i in range(n+m+1):
    if cnt[i]==max:
        print(i,end=' ')

