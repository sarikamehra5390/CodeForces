package BossFight;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int sum = 0 ;
            int[] nums = new int[n];
            for(int i = 0 ; i < n ; i++){
                nums[i] = sc.nextInt();
                sum += nums[i];
            }

            int[] freq = new int[1001];
            for(int x : nums){
                freq[x]++;
            }

            int maxFreq = 0 ;
            int maxValue = 0 ;
           for(int i = 1 ; i <= 1000 ; i++){
            if(freq[i] >maxFreq){
                maxFreq = freq[i];
                maxValue = i;
            }
           }

            int others = n - maxFreq;

            if(others >= maxFreq - 1){
                System.out.println(sum);
            }else{
                int lostCopies = Math.max(0,maxFreq -  others - 2);
                int ans = sum - lostCopies * maxValue;
                System.out.println(ans);
            }

        }

        sc.close();
    }
    
}
