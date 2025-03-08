#include <stdio.h>

int main() {
    int numero;

    printf("Ingresa el número a multiplicar: \n");
    scanf("%d", &numero);

    for (int i = 1; i <=10; i++){
        printf("%d x %d = %d\n", numero, i, numero*i);
    }
}