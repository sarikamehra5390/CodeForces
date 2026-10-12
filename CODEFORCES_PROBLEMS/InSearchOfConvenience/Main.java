package CODEFORCES_PROBLEMS.InSearchOfConvenience;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0 ){
            int xo = sc.nextInt();
            int yo = sc.nextInt();
            int R = sc.nextInt();

           int x = xo;
           int y = yo - R ;
           
           System.out.println(x);
           System.out.println(y);
        
        }

        sc.close();
    }
    
}
