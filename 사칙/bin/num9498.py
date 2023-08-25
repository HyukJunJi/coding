a = int(input())
com = lambda a: "A" if a>=90 else("B" if a>=80 else("C" if a>=70 else("D" if a>=60 else "F")))
print(com(a))