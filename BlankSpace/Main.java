package BlankSpace;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int countZero = 0;
            int count = 0;

            for(int i = 0 ; i < n ; i++){
                int x = sc.nextInt();

                if(x == 0){
                   countZero++;
                }else if(x == 1 && countZero > 0){
                    countZero = 0 ;
                }else{
                    continue;
                }

               count = Math.max(count, countZero);
            }

            System.out.println(count);
        }
        sc.close();
    }
}