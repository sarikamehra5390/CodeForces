
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            long[] a = new long[n];

            for(int i = 0 ; i < n ; i++){
                a[i] = sc.nextInt();
            }

            // we need the smallest (m - 1) elements
            // before the current element
            // this is basically max heap 
            PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());

            long sum = 0 ;
            long ans = Long.MIN_VALUE;

            for(int i = 0 ; i < n ; i++){
                // current element can be last selected element
                if(pq.size() == m - 1){
                    long score = (long) m * a[i] - sum;
                    
                    ans = Math.max(ans , score);
                }

                // add current element for future position
                pq.add(a[i]);
                sum += a[i];

                // keep only the smallest m - 1 elements 
                if(pq.size() > m - 1){
                    long largest = pq.poll();
                    sum -= largest;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
    
}
