a,b = map(int,input().split())
c = int(input())
totalmin = a*60+b+c
finalhour = int(totalmin / 60) % 24
finalmin = totalmin % 60
print(finalhour,finalmin)