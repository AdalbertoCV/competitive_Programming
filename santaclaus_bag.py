def kS(W, wt, val):
    n = len(val)
    table = [[0 for x in range(W + 1)] for x in range(n + 1)]
    for i in range(n + 1):
        for j in range(W + 1):
            if i == 0 or j == 0:
                table[i][j] = 0
            elif wt[i - 1] <= j:
                table[i][j] = max(val[i - 1] + table[i - 1][j - wt[i - 1]], table[i - 1][j])
            else:
                table[i][j] = table[i - 1][j]
    return table

peso = 0
casos = int(input())
maximo = 50
for i in range(casos):
    paquetes = int(input())
    amounts = []
    weights = []
    pesos = []
    for x in range(paquetes):
        juguete = input().split(" ")
        amounts.append(int(juguete[0]))
        weights.append(int(juguete[1]))
    print(kS(maximo, weights, amounts), "brinquedos")