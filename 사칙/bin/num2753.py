a = int(input())

if a % 4==0 and a % 100 != 0 or a % 400 == 0:
    print("1")
else:
    print("0")

a = int(input())
com = lambda a : "1" if a % 4==0 & a and 100 != 0 or a%400==0 else "0"
print(com(a))