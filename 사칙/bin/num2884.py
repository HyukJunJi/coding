a ,b = map(int,input().split())

if b<45:
    if a==0:
        print((24-1),(60-(45-b)))
    else:
        print((a-1),(60-(45-b)))
        
else:
    print(a,(b-45))
    