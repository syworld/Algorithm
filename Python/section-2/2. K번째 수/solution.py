import sys

sys.stdin = open("in1.txt", "rt")
t = int(input())
for i in range(t):
    n, s, e, k = map(int, input().split())
    a = list(map(int, input().split()))

    # s번째부터 e번째
    a = a[s - 1:e]
    a.sort()
    print('#{}'.format(i + 1), a[k - 1])
    # print("#%d %d" % (t + 1, a[k - 1]))
