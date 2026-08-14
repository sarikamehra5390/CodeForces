package OneAndTwo;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] nums = new int[n];

            int countTwo = 0 ;

            for(int i = 0 ; i < n ; i++){
                nums[i] = sc.nextInt();

                if(nums[i] == 2){
                    countTwo++;
                }
            }

                if(countTwo == 0){
                    System.out.println(1);
                }else if(countTwo % 2 == 1){
                System.out.println(-1);
                }else{
                    int target = countTwo / 2;
                    int currentTwo = 0;

                    for(int i = 0 ; i < n ; i++){
                        if(nums[i] == 2){
                            currentTwo++;

                            if(currentTwo == target){
                                System.out.println(i + 1);
                                break;
                            }
                        }
                    }
                 }
        }
        sc.close();
    }
    
}
