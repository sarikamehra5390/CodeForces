
import java.util.*;
public class Main {

    // TC --> O(n) for k = 1 and O(1) for k > 1
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   

        while(t-- > 0){

            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] nums = new int[n];

            boolean sorted = true;

            for(int i = 0 ; i < n ; i++){
                nums[i] = sc.nextInt();
            }

            if(k == 1){
                for(int i = 1 ; i< n; i++){
                    if(nums[i] < nums[i-1]){
                        sorted = false;
                        break;
                    }
                }
                System.out.println(sorted ? "YES" : "NO");
            }else{
                System.out.println("YES");
            }
           
        }

        sc.close();
        
    }

}