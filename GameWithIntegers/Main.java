package GameWithIntegers;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t  = sc.nextInt(); // number of test cases

        while(t-- > 0){
            int n = sc.nextInt(); // the input integer

            if(n % 3 == 0){
                System.out.println("Second");
            }else{
                System.out.println("First");
            }
        }
        sc.close();
    }
}
