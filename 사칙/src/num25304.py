totprice = int(input())
totnum = int(input())
sum = 0
for i in range(totnum):
    a,b=map(int,input().split())
    sum = sum + (a*b)
if sum == totprice:
    print("Yes")
else:
    print("No")