package ExtremelyRound;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int digit = n ;
            int count = 0;

            while(digit> 0){
            digit /= 10;
            count++;
            }

            int firstDigit = n;

            while(firstDigit >= 10){
                firstDigit /= 10;
            }

            int ans = (count - 1) * 9 + firstDigit;
            System.out.println(ans);

            
        }
        sc.close();
    }
    
}
