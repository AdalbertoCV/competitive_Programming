import java.util.Scanner;

public class SearchSubString {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String subString = in.nextLine();
        System.out.println(string);
        System.out.println(subString);
        in.close();
        System.out.println("Number of occurrences: " + String.valueOf(searchString(string, subString)));

    }

    public static int searchString(String string, String subString){
        int cont = 0; 
        while(string.contains(subString)){
            cont++;
            string = string.replaceFirst(subString, "");
        }
        return cont;
    }
}
