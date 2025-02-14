public class FizzBuzz {
    public static void main(String[] args) {
        int cont = 1;
        while (cont < 101){
            if (cont % 3 == 0 && cont % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else{
                if (cont % 3 == 0){
                    System.out.println("Fizz");
                }
                else{
                    if (cont % 5 == 0){
                        System.out.println("Buzz");
                    }
                    else{
                        System.out.println(cont);
                    }
                }
            }
            cont++;
        }
        
    }
}
