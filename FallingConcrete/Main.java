package FallingConcrete;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for(int i = 0 ; i < n ; i++){
                a[i] = sc.nextInt();

                // 1 based indexing 
                b[i] = a[i] - (i + 1);
            }

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for(int i = 0 ; i < n ; i++){
                min = Math.min(min , b[i]);
                max = Math.max(max, b[i]);
            }

            int ans = 0 ;
            
            //check every possible starting value 
            for(int i = min ; i <= max ; i++){
                int current = i ;
                int count = 0 ;

                // keep looking for i , i + 1, ...so on
                while(contains(b , current)){
                    count++;
                    current++;
                }
                ans = Math.max(ans, count);
            }

            System.out.println(ans);
        }
        sc.close();
    }

    // check wheather x exists in b 
    static boolean contains(int[] b , int x){
        for(int value : b){
            if(value == x){
                return true;
            }
        }
        return false;
    }
}