package Desorting;
import java.util.*;

public class Main {

    public static boolean isSorted(int[] nums){
        for(int i = 1 ; i < nums.length; i++){
            if(nums[i] < nums[i - 1]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0 ){
            int n = sc.nextInt();
            int[] nums = new int[n];

            for(int i = 0; i < n ; i++){
                nums[i] = sc.nextInt();
            }
            // if already unsorted
            if(!isSorted(nums)){
                System.out.println(0);
                continue;
            }

            int minDiff = Integer.MAX_VALUE;

            for(int i = 1; i < n ; i++){
                minDiff = Math.min(minDiff, nums[i] - nums[i - 1]);
            }
            System.out.println(minDiff / 2 + 1);
        }

        sc.close();
        
    }
}