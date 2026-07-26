package DaytonaCost;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt(); // number of element in the array
            int k = sc.nextInt(); // number of most frequent element

            int[] nums = new int[n];
            for(int i = 0 ; i < n ; i++){
                nums[i] = sc.nextInt();
            }

            boolean found = false;

          for(int num : nums){
            if(num == k){
                found = true;
                break;
            }
          }

          if(found){
            System.out.println("Yes");
          }else{
            System.out.println("No");
          }
    
        }
        sc.close();

    }
    
}
