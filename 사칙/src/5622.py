ar =["ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"]

S = input()
second = 0
cnt=0
for i in S:
    cnt=0
    for j in ar:   
        num = j.find(i)
        if num>=0:
            second+=(cnt+3)
        else:
            cnt+=1

