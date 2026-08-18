package EverybodyLikesGoodArrays;
import java.util.*;;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] nums = new int[n];
            for(int i = 0 ; i < n ; i++){
                nums[i] = sc.nextInt();
            }

            int count = 0 ;
            
            for(int i = 1 ; i < n ; i++){
                if(nums[i] % 2 == nums[i - 1] % 2){
                    count++;
                }
            }
            System.out.println(count);
        }

        sc.close();
    }
    
}
