# 입력값 〉	["mislav", "stanko", "mislav", "ana"], ["stanko", "ana", "mislav"]
# 기댓값 〉	"mislav"

def solution(participant, completion):
    hash = dict()

    for p in participant:
        hash[p] = hash.get(p, 0) + 1

    for c in completion:
        hash[c] -= 1

    for key, value in hash.items():
        if value > 0:
            return key