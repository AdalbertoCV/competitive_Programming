import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindromos {
    public static void main(String[] args) throws IOException{
        String string =  new BufferedReader(new InputStreamReader(System.in)).readLine().toLowerCase().replace(" ", "");
        System.out.print(compararCadenas(string, invertirCadena(string)));
    }

    public static boolean compararCadenas(String string1, String string2){
        return string1.equalsIgnoreCase(string2);
    }

    public static String invertirCadena(String string){
        return new StringBuilder(string).reverse().toString();
    }
}