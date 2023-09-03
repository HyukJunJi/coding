a,b = input().split()

a = a[::-1]
b = b[::-1]

num1 = int(a)
num2 = int(b)
print(num1) if num1>num2 else print(num2)