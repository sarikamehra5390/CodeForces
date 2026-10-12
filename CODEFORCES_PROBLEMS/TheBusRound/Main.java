package CODEFORCES_PROBLEMS.TheBusRound;
import java.util.*;

public class Main {

    public static long sum(long x, long m){

        long completeBlocks = x / m;
        long remainingBlocks = x % m;

        // sum of one complete blocks 
        long blockSum = m * (m - 1)/ 2;

        // complete blocks + remaining block 
        return  completeBlocks * blockSum + remainingBlocks * (remainingBlocks + 1)/ 2;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0 ){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long m = sc.nextLong();

            long ans = sum(b , m) - sum(a , m);

            System.out.println(ans);
        }
        
    }
    
}
