package ArrayColoring;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int first = sc.nextInt();
            int sum = 0 ;

            for(int i = 1; i < n ; i++){
                int x = sc.nextInt();

               sum = sum + x;
            }

               if(sum % 2 == 0 && first % 2 == 0 || sum % 2 == 1 && first % 2 == 1){
                System.out.println("Yes");
               }else{
                System.out.println("No");
               }

            
        }

        sc.close();;
    }
}