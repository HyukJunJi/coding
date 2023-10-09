chess=list(map(int,input().split()))
stand =[1,1,2,2,2,8]
re= [stand[i]-chess[i] for i in range(6)]
print(*re)
