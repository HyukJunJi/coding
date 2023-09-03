N,X=map(int,input().split())

A = list(map(int,input().split()))

c = [i for i in A if i<X]
print(*c)

