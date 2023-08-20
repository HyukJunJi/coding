def calculate_prize(dice):
    if len(dice) != 3:
        return 0

    dice.sort()  # 주사위 눈을 오름차순으로 정렬

    if dice[0] == dice[2]:  # 모두 같은 눈일 경우
        return 10000 + dice[0] * 1000
    elif dice[0] == dice[1] or dice[1] == dice[2]:  # 두 개가 같은 눈일 경우
        return 1000 + dice[1] * 100
    else:  # 모두 다른 눈일 경우
        return dice[2] * 100

# 주사위 눈 입력 받기
dice = list(map(int, input().split()))

# 상금 계산 및 출력
result = calculate_prize(dice)
print(result)
