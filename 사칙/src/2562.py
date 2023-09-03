a= [int(input()) for i in range(9)]
max=-100
for i in a:
    if i>max:
        max=i
print(max)
print(a.index(max)+1)