package MakeItBeautiful;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0 ) {
            int n = sc.nextInt();

            int[] nums = new int[n];

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for(int i = 0 ; i < n ; i++){
                nums[i] = sc.nextInt();

                min = Math.min(min , nums[i]);
                max = Math.max(max, nums[i]);
            }

            if(min == max){
                System.out.println("No");
            }else{
                System.out.println("Yes");

                int maxIdx = 0 ;

                for(int i = 0 ; i < n ; i++){
                    if(nums[i] == max){
                        maxIdx = i ;
                        break;
                    }
                }
                System.out.print(max + " ");

                for(int i = 0 ; i < n ; i++){
                    if(i != maxIdx){
                        System.out.print(nums[i] + " ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}