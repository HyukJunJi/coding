
N,M=map(int,input().split())
ar=[0 for i in range(N)]

for i in range(M):
    fro,to,num = map(int,input().split())
    for j in range(fro-1,to):
        ar[j]=num
print(*ar)
    
    