arr = ["c=","c-","dz=","d-","lj","nj","s=","z="]
arr1=input()
for i in arr:
    arr1=arr1.replace(i,"*")
print(len(arr1))
# 새로운 배열에 뭐가 들어갔는지 체크하고 그걸 빼고 나머지걸 센후에 더하기