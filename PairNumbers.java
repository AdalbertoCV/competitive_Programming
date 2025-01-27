import java.util.ArrayList;
import java.util.Scanner;

public class PairNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        printResult(start, end);
        in.close();
    }

    public static void printResult(int start, int end){
        if (limitsAreValid(start, end)){
            System.out.println(returnPairs(start, end));
        }
        else{
            System.out.println("[]");
        }
    }

    public static boolean limitsAreValid(int start, int end){
        if ((start > 0) && (start > end)){
            return false;
        }
        return true;
    }

    public static ArrayList<Integer> returnPairs(int start, int end){
        ArrayList<Integer> pairs = new ArrayList<>();
        for (int i = start; i <= end; i++){
            if (i % 2 == 0){
                pairs.add(i);
            }
        }
        return pairs;
    }
}
