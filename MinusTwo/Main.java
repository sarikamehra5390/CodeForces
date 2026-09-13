package MinusTwo;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0 ){
            int n = sc.nextInt();

            int oddCount = 0 ;
            int divisibleBy4 = 0 ;
            int remainder2 = 0 ;

            for(int i = 0 ; i < n ; i++){
                long x = sc.nextLong();

                if(x % 2  != 0 ){
                    oddCount++;
                }else if(x % 4 == 0){
                    divisibleBy4++;
                }else{
                    remainder2++;
                }
            }

            int answer = Math.max(oddCount, Math.max(divisibleBy4, remainder2));

            System.out.println(answer);
        }

        sc.close();
    }

    
    
}
