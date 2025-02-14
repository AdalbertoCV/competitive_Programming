n = int(input())
numeros = input()
desordenados = numeros.split(" ")
ordenados = sorted (desordenados)
cont =0
imposible =0
for i in ordenados:
    if (cont < (n-2)):
        if (not(int(ordenados[cont+1]) == int(i)+1)):
            imposible = int(i)+1
    cont = cont +1
            
if (imposible ==0):
    print("imposible")
else:
    print(imposible)