
# 입력값 〉	[["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]
# 기댓값 〉	5

# 스파이가 옷을 입는 경우 의 수 = (A 옷 보유 수 + 1) (B 옷 보유 수 + 1) (C 옷 보유 수 + 1) - 1(아무것도 입지 않는 경우)
# 1. yellow_hat
# 2. blue_sunglasses
# 3. green_turban
# 4. yellow_hat + blue_sunglasses
# 5. green_turban + blue_sunglasses


def solution(clothes):
    answer = 1
    hash_map = dict()

    for cloth, cloth_type in clothes:
        hash_map[cloth_type] = hash_map.get(cloth_type, 0) + 1

    for cloth_type in hash_map:
        answer *= hash_map[cloth_type] + 1

    answer -= 1
    return answer