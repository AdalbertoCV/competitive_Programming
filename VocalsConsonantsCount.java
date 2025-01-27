import java.util.Scanner;

public class VocalsConsonantsCount {

    public static void main(String[] args) {
        String vocals = "aeiou";
        String consonants = "bcdfghjklmnpqrstvwxyz";
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        in.close();
        System.out.println("Number of vocals: " + String.valueOf(countOcurrences(text, vocals)));
        System.out.println("Number of consonants: " + String.valueOf(countOcurrences(text, consonants)));
    }

    public static int countOcurrences(String text, String charlist){
        int cont = 0;
        for (int i = 0; i < text.length(); i++){
            if (charlist.contains(String.valueOf(text.charAt(i)))){
                cont++;
            }
        }
        return cont;
    }
}
