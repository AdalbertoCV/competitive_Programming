import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZerosInFactorial {
    public static void main(String[] args) throws IOException{
        Long n = Long.parseLong(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.print(countZeros(n));
    }

    public static int countZeros(Long n){
        int count = 0;
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        return count;
    }
}