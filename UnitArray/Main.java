package UnitArray;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int countNegOnes = 0 ;
            int countPosOnes = 0 ;
    

            for(int i = 0 ; i < n ; i++){
                int x = sc.nextInt();

                if(x == 1){
                    countPosOnes++;
                }else{
                    countNegOnes++;
                }
            }
         
             int ans = 0 ;

             // make sum >= 0
             while(countPosOnes < countNegOnes){
                countPosOnes++;
                countNegOnes--;
                ans++;
             }

             // make product = 1
             if(countNegOnes % 2 != 0){
                ans++;
             }
             System.out.println(ans);
        }
        sc.close();
    }
    
}
