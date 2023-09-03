N,M=map(int,input().split())
ar = [i+1 for i in range(N)]
for i in range(M):
    start,end = map(int,input().split())
    tmp = ar[start-1:end]
    tmp.reverse()
    ar[start-1:end]=tmp
print(*ar)
# ar = [1,2,3,4,5]
# # 1~2 사실 0~1
# start= 1
# end =2
# ar=ar[start+(-1)::-1]
# print(ar)