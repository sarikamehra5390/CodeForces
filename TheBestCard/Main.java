package TheBestCard;
import java.util.*;

public class Main {
    public static boolean isPrime(int m){
        if(m <= 1){
            return false;
        }

        for(int i = 2; i * i <= m; i++){
            if(m % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            if(isPrime(n + 1)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            
        }

           
        }
        sc.close();
    }
    
}
