import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZerosInFactorial {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());
        System.out.print(countZeros(n));
    }

    // return the numbe of 0 in a String.
    public static int countZeros(Long n){
        int count = 0;
        
        // Count multiples of 5, 25, 125, etc.
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        
        return count;
    }
}
