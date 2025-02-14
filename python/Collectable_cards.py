def mcd(a, b):
    temp = 0
    while b != 0:
        temp = b
        b = a % b
        a = temp
    return a
n = int(input())
for i in range (n):
    caso = input().split(" ")
    a = int(caso[0])
    b = int(caso[1])
    print(mcd(a,b))  