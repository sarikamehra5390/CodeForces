package HypercarbAndTheControlPanel;
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

           ArrayList<Integer> value = new ArrayList<>();
           ArrayList<Integer> len = new ArrayList<>();

        

           int i = 0 ;

           while(i < n){
             int current = nums[i];
             int count = 0 ;

             while(i < n && nums[i] == current){
                count++;
                i++;
             }
             value.add(current);
             len.add(count);
           }

           boolean twoConsecutive = false;

           for(int j = 0 ; j < len.size() - 1 ; j++){
              if(len.get(j) > 1 && len.get(j + 1) > 1){
                  twoConsecutive = true;
                  break;
            }
           }

           boolean oneDuplicate = false;

           for(int x : len){
            if(x > 1){
                oneDuplicate = true;
                break;
            }
           }

           if(twoConsecutive)
               System.out.println(value.size() + 2);
           else if(oneDuplicate && value.size() > 1)
                System.out.println(value.size() + 1);
            else{
                System.out.println(value.size());
            }
       }
       sc.close();
    }
}
    

