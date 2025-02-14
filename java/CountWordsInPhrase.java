import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountWordsInPhrase {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase = br.readLine();
        String[] words = phrase.split(" ");
        System.out.print(words.length);
    }
}
