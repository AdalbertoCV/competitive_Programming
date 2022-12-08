n = int(input())
for i in range (n):
    caso = input().split(" ")
    if(caso[1] == "bin"):
        print ("Case "+str(i+1)+":")
        print(str(int(caso[0],base=2))+" dec")
        hexa = str(hex(int(caso[0],base=2)))
        print(str(hexa[2:])+" hex")
        print()
    if(caso[1] == "hex"):
        print ("Case "+str(i+1)+":")
        print(str(int(caso[0],base=16))+" dec")
        binario = str(bin(int(caso[0],base=16)))
        print(str(binario[2:])+" bin")
        print()
    if (caso[1] == "dec"):
        print ("Case "+str(i+1)+":")
        hexa = str(hex(int(caso[0])))
        print(str(hexa[2:])+" hex")
        binario = str(bin(int(caso[0])))
        print(str(binario[2:])+" bin")
        print()