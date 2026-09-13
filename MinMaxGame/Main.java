package MinMaxGame;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int countZero = 0 ;
            int countOne = 0;

            for(int i = 0 ; i < n ; i++){
                int x = sc.nextInt();

                if(x == 1){
                    countOne++;
                }else{
                    countZero++;
                }
            }

            if(countOne >= countZero){
                System.out.println("Bessie");
            }else{
                System.out.println("Elsie");
            }
        }
        sc.close();
    }
    
}
