num = int(input())

for i in range(num):
    for k in range(num-1,i,-1):
        print(" ",end="")
    for j in range(0,i+1,1):
        print("*",end="")
    print()

n=int(input())
for i in range(1,n+1):
    print(' '*(n-i)+'*'*i)