package ZeroSum;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   // number of test cases

        while (t-- >0) {

           int n = sc.nextInt(); // number of elements in the array

           int sum = 0;

            for(int i = 0 ; i < n ; i++){
               sum += sc.nextInt();
             }

             if(n % 2 != 0){
                System.out.println("No");
             }else if(sum % 4 == 0){
                System.out.println("Yes");
             }else{
                System.out.println("No");
             }

        }
        sc.close();
    }
    
}
