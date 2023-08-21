# a,b = map(int,input().split())
# if a>b:
#     print(">")
# elif a<b:
#     print("<")
# else:
#     print("==")
compare = lambda a, b: ">" if a > b else ("<" if a < b else "==")

a, b = map(int, input().split())
print(compare(a, b))
