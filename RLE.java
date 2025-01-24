import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RLE {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        String compressed = compress(text);
        System.out.println(compressed);
        String uncompressed = uncompress(compressed);
        System.out.println(uncompressed);
    }

    public static String uncompress(String text){
        String result = "";
        for (int i = 0; i < text.length(); i = i + 2){
            int num = Integer.parseInt("" + text.charAt(i+1));
            for (int j = 0; j < num; j++){
                result = result + text.charAt(i);
            }
        }

        return result;
    }

    public static String compress(String text) {
        int consecutive = 1;
        char actual = text.charAt(0);
        String result = "";
    
        for (int i = 1; i < text.length(); i++) {
            if (actual == text.charAt(i)) {
                consecutive++;
            } else {
                // Se agrega el caracter actual
                result = result + actual;
                if (consecutive >= 1) {
                    // agregamos el numero de repeticiones
                    result = result + consecutive;
                }
                // reiniciamos el conteo para el siguiente caracter
                actual = text.charAt(i);
                consecutive = 1;
            }
        }
    
        // Procesamos el último grupo después del bucle
        result = result + actual;
        if (consecutive >= 1) {
            result = result + consecutive;
        }
    
        return result;
    }
}
