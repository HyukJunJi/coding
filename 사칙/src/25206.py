tot=0.0
totcnt=0.0
for i in range(20):
    a,b,c=input().split()
    b=float(b)
    if(c=="A+"):
        tot=tot+b*4.5
        totcnt=totcnt+b
    elif(c=="A0"):
        tot=tot+b*4.0
        totcnt=totcnt+b
    elif(c=="B+"):
        tot=tot+b*3.5
        totcnt=totcnt+b
    elif(c=="B0"):
        tot=tot+b*3.0
        totcnt=totcnt+b
    elif(c=="C+"):
        tot=tot+b*2.5
        totcnt=totcnt+b
    elif(c=="C0"):
        tot=tot+b*2.0
        totcnt=totcnt+b
    elif(c=="D+"):
        tot=tot+b*1.5
        totcnt=totcnt+b
    elif(c=="D0"):
        tot=tot+b*1.0
        totcnt=totcnt+b
    elif(c=="F"):
        tot=tot+b*0.0
        totcnt=totcnt+b
    elif(c=="P"):
        # totcnt=totcnt+b
        pass
print(tot/totcnt)
    
