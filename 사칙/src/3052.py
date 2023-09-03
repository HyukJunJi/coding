ar = [int(input()) for i in range(10)]

ar1 = [i%42 for i in ar]

set1=set(ar1)
print(len(set1))