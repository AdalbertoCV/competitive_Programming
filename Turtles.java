import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Turtles {
    public static void main(String[] args) throws IOException {
        System.out.println("Por favor, escribe tu animal favorito.");
        String animal_favorito = new BufferedReader(new InputStreamReader(System.in)).readLine();
        mostrarMensaje(esTortuga(animal_favorito));
    }

    public static boolean esTortuga(String animal){
        return animal.equalsIgnoreCase("tortuga");
    }

    public static void mostrarMensaje(boolean esTortuga){
        if(!esTortuga){
            System.out.println("Ese animal es genial, pero prefiero las tortugas");
        }
        else{
            System.out.println("También me gustan las tortugas.");
        }
    }
}