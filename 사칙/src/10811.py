N,M=map(int,input().split())
a = [i for i in range(1,N+1)]
print(a)
for i in range(1,N):
    start,end = map(int,input().split())
    a[start:end+1] = a[start:end+1:-1]
print(*a)