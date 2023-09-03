N = int(input())
ar = list(map(int,input().split()))
max1 = max(ar)
sum=0
for i in ar:
    sum= sum+(i/max1*100)
avg= sum/len(ar)
print(avg)