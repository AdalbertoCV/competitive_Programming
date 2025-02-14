import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class CasaEncantada {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static int[][] casa = new int[4][4];
    public static int[] posicion = {0,0};
    public static char[] operadores = {'+', '-', '*'};
    public static Random generador = new Random();
    public static int puerta = 0;
    public static int enigma = 1;
    public static int fantasma = 2;
    public static int dulces = 3;

    public static void main(String[] args) throws IOException {
        juego();
    }

    public static void juego() throws IOException{
        casa = llenarCasa();
        System.out.println("Has entrado a la casa encantada. Para escapar, debes llegar al cuarto misterioso de los dulces.");
        System.out.println("Responde acertijos y decide a donde moverte. Mucha Suerte."); 
        while (revisarCuarto() != dulces){
            if (revisarCuarto() == puerta){
                System.out.println("Estas en la puerta, puedes moverte.");
                flujoPreguntas(puerta);
            }
            else if (revisarCuarto() == enigma){
                System.out.println("Has caído en un enigma, debes responder un acertijo para moverte.");
                flujoPreguntas(enigma);
            }
            else if(revisarCuarto() == fantasma){
                System.out.println("Has caído en un fantasma, debes responder dos acertijos para moverte");
                flujoPreguntas(fantasma);
            }
        }
        System.out.println("Has caído en la habitación de los dulces, has ganado!!!!");
    }

    public static void flujoPreguntas(int numPreguntas) throws IOException{
        try{
            int contadorPreguntas = 0;
            while(contadorPreguntas < numPreguntas){
                int num1 = generarNum();
                int num2 = generarNum();
                char operador = generarOperador();
                mostrarOperacion(num1, operador, num2);
                int solucion_usuario = Integer.parseInt(entrada.readLine());
                if (compararResultado(calcularResultado(num1, operador, num2), solucion_usuario)){
                    contadorPreguntas++;
                    System.out.println("Respuesta correcta :)");
                }
                else{
                    System.out.println("Incorrecto :(");
                }
            }
            System.out.println("¿A donde deseas moverte? (0) arriba, (1) abajo, (2) derecha, (3) izquierda");
            int movimiento = Integer.parseInt(entrada.readLine());
            moverse(movimiento);
        }
        catch(NumberFormatException e){
            System.out.println("Error en el formato del numero ingresado.");
        }
    }

    public static int[][] llenarCasa(){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                casa[i][j] = generarIndex();
            }
        }
        casa[0][0] = 0;
        // coloca la habitacion de dulce en un lugar totalmente aleatorio.
        casa[generarIndex()+ 1][generarIndex() + 1] = 3;
        return casa;
    }

    public static int revisarCuarto(){
        return casa[posicion[0]][posicion[1]];
    }

    public static int generarNum(){
        return generador.nextInt(99) + 1;
    }

    public static int generarIndex(){
        return generador.nextInt(2) + 1;
    }

    public static char generarOperador(){
        int index = generador.nextInt(3);
        return operadores[index];
    }

    public static void mostrarOperacion(int num1, char operador, int num2){
        System.out.println(String.valueOf(num1) + " " + operador + " " + String.valueOf(num2));
    }

    public static int calcularResultado(int num1, char operador, int num2){
        switch (operador) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            default:
                return 0;
        }
        
    }

    public static boolean compararResultado(int resultadoCorrecto, int resultadoUsuario){
        return resultadoCorrecto == resultadoUsuario;
    }

    public static void moverse(int decision){
        switch (decision) {
            // 0 para subir
            case 0:
                subir();
                break;
            // 1 para bajar
            case 1:
                bajar();
                break;
            // 2 para derecha
            case 2:
                derecha();
                break;
            // 3 para izquierda
            case 3:
                izquierda();
                break;
            default:
                System.out.println("No pudiste moverte ya que no elegiste una opción adecuada.");
                break;
        }
    }

    public static void subir(){
        if (posicion[1] > 0){
            posicion[1]--;
        }
        else{
            System.out.println("No hay más habitaciones arriba, te has quedado en tu posición.");
        }
    }

    public static void bajar(){
        if (posicion[1] < 3){
            posicion[1]++;
        }
        else{
            System.out.println("No hay más habitaciones abajo, te has quedado en tu posición.");
        }
    }

    public static void derecha(){
        if (posicion[0] < 3){
            posicion[0]++;
        }
        else{
            System.out.println("No hay más habitaciones a la derecha, te has quedado en tu posición.");
        }
    }

    public static void izquierda(){
        if (posicion[0] > 0){
            posicion[0]--;
        }
        else{
            System.out.println("No hay más habitaciones a la izquierda, te has quedado en tu posición.");
        }
    }
}