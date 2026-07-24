package DoremyPaint3;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
           
            int[] nums = new int[n];
            for(int i = 0 ; i < n ; i++){
                nums[i] = sc.nextInt();
            }

            HashMap<Integer, Integer> map = new HashMap<>();

            for(int num : nums){
                map.put(num, map.getOrDefault(num, 0) + 1);

            }

            if(map.size() > 2){
                System.out.println("No");
            }else if(map.size() == 1){
                System.out.println("Yes");
            }else{

                int f1 = 0;
                int f2 = 0;
                int cnt = 0 ;

                for(int freq : map.values()){
                    if(cnt == 0) f1 = freq;
                    else f2 = freq;
                    cnt++;
                }

                if(Math.abs(f1 - f2) <= 1) System.out.println("Yes");
                else System.out.println("No");
            }
        }
        sc.close();
    }
}