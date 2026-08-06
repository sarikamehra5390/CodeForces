package TwinPermutation;
import java.util.*;

public class Main {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0 ){
            int n = sc.nextInt();
            int[] b = new int[n];
            int idx = 0 ;

            int constant = n + 1;

            for(int i = 0 ; i < n ; i++){
                int x = sc.nextInt();

                b[idx++] = (constant - x);
            }


           for(int i = 0 ; i < n ; i++){
            System.out.print(b[i] + " ");
           }
           System.out.println();
        }
        sc.close();
    }
    
}
