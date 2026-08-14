package ServalAndMochaArray;
import java.util.*;

public class Main {

    public static int gcd(int a, int b){
        while (b != 0) {
            int temp = b ;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0 ; i < n ; i++){
                nums[i] = sc.nextInt();
            }

            boolean found = false;

            for(int i = 0 ; i < n ; i++){
                for(int j = i + 1 ; j < n ; j++){
                    if(gcd(nums[i] , nums[j]) <= 2){
                        found = true;
                        break;
                    }
                }
                if(found){
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