package Gigantomachy;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            long[] bea = new long[n];
            long[] ver = new long[m];

            for(int i = 0 ; i < n ; i++){
                bea[i] = sc.nextLong();
            }

            for(int i = 0 ; i < m ; i++){
                ver[i] = sc.nextLong();
            }

            long beasHits = ver[0] + m - 1;
            long versHits = bea[0] + n - 1;


            if(beasHits <= versHits){
                System.out.println(1);
            }else{
                System.out.println(2);
            }
        }
        sc.close();
    }
}
