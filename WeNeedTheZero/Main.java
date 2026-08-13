package WeNeedTheZero;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int totalXor = 0 ;

            for(int i = 0 ; i < n ; i++){
                int x = sc.nextInt();
                totalXor ^= x;
            }

            if(n % 2 ==  0){ // n is even 
                if(totalXor == 0){
                    System.out.println(totalXor);
                }else{
                    System.out.println(-1);
                }
            }else{
                System.out.println(totalXor);
            }

        }
    }
}