package JaggedSwaps;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int first = sc.nextInt();

            for(int i = 1 ; i < n ; i++){
                sc.nextInt(); // read the remaining elements
            }

            if(first == 1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
        sc.close();
    }
    
}
