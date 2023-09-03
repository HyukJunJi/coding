ar = [int(input()) for i in range(1,29)]
lc=[]
cnt=0
for i in range(1,31):
    cnt=0
    for j in ar:
        if i==j:
            cnt-=1
            if cnt==27:
                cnt=0
        else:
            cnt+=1
            if cnt==28:
                lc.append(j)
                cnt=0
lc.sort()
print(*lc)
