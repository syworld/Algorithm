# 깊이/너비 우선 탐색(DFS/BFS)

cnt = 0


def dfs(n, sum_numbers, target, numbers, last_index):
    global cnt

    if n == last_index + 1:
        if sum_numbers == target:
            cnt += 1
        return

    dfs(n + 1, sum_numbers + numbers[n], target, numbers, last_index)
    dfs(n + 1, sum_numbers - numbers[n], target, numbers, last_index)


def solution(numbers, target):
    last_index = len(numbers) - 1
    dfs(0, 0, target, numbers, last_index)
    return cnt