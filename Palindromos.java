import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindromos {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine().toLowerCase().replace(" ", "");
        String stringInvertida = invertirCadena(string);
        System.out.print(compararCadenas(string, stringInvertida));
    }

    public static boolean compararCadenas(String string1, String string2){
        if (string1.length() != string2.length()){
            return false;
        }
        int coincidencias = 0;
        for (int i = 0; i < string1.length(); i++){
            if (string1.charAt(i) == string2.charAt(i)){
                coincidencias++;
            }
        }
        if (coincidencias == string1.length()){
            return true;
        }
        else{
            return false;
        }
    }

    public static String invertirCadena(String string){
        String finalString = "";
        for (int i = string.length() - 1; i >= 0; i--){
            finalString = finalString + string.charAt(i);
        }
        return finalString;
    }
}
