import java.util.Scanner;

public class InvertNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = String.valueOf(in.nextInt());
        in.close();
        int invertedNumber = Integer.parseInt(invert(num));
        System.out.println(invertedNumber);
    }

    public static String invert(String string){
        String finalString = "";
        for (int i = string.length() - 1; i >= 0; i--){
            if (string.charAt(i) != '-'){
                finalString = finalString + string.charAt(i);
            }
        }
        if (string.charAt(0) == '-'){
            return "-" + finalString;
        }
        return finalString;
    }
}
