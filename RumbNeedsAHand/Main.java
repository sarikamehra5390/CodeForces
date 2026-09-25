package RumbNeedsAHand;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            int[] p = new int[n];

            for(int i = 0 ; i < n ; i++){
                p[i] = sc.nextInt();
            }
            
            // keeping all the misplaced elements in the array
            ArrayList<Integer> wrong = new ArrayList<>();

            // store misplaced elements 
            for(int i = 0 ; i < n; i++){
                if(p[i] != i + 1){
                    wrong.add(p[i]);
                }
            }

            boolean possible = true ;

            // misplaced elements must be in decreasing order
            for(int i = 1 ; i < wrong.size(); i++){
                if(wrong.get(i - 1) < wrong.get(i)){
                    possible = false;
                    break;
                }
            }

            if(possible){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
