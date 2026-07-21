package CoverInWater;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            
          

            String s = sc.next();
            int count = 0;

          for(int ch : s.toCharArray()){
            if(ch == '.'){
                count++;
            }
          }
          if(s.contains("...")){
            System.out.println(2);
          }else{
            System.out.println(count);
          }
        }

        sc.close();
        
    }
}
