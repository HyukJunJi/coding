N,M = map(int,input().split())
ar = [i+1 for i in range(N)]
for i in range(M):
    a,b=map(int,input().split())
    tmp=ar[a-1]
    ar[a-1]=ar[b-1]
    ar[b-1]=tmp
print(*ar)
