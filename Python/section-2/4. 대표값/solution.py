import sys

sys.stdin = open("in1.txt", "rt")
n = int(input())
a = list(map(int, input().split()))

# 소수첫째자리 반올림 -> round()
# round 함수는 round_half_even 방식 (4.5 일때 4로 5.5 일때 6으로)
# avg = round(sum(a)/n)
avg = sum(a) / n
avg += 0.5
avg = int(avg)
min = 2147000000

for idx, x in enumerate(a):
    tmp = abs(x - avg)
    if tmp < min:
        min = tmp
        score = x
        result = idx + 1
    elif tmp == min:
        # 점수가 큰 학생이 답
        if x > score:
            score = x
            result = idx + 1

print(score, result)
