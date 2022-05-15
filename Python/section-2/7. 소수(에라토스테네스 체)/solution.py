import sys

sys.stdin = open("in1.txt", "rt")
n = int(input())
# 1부터 n 까지 소수 개수 출력
chk = [0] * (n + 1)
cnt = 0

for i in range(2, n + 1):
    if chk[i] == 0:  # 소수 일 때
        cnt += 1
        for j in range(i, n + 1, i):  # i의 배수들 check
            chk[j] = 1  # 소수가 아닐 때
print(cnt)
