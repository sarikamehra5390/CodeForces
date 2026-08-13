package PrependAndAppend;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();


            int i = 0 ; 
            int j = n - 1;

            while(i < j){
                if(s.charAt(i) != s.charAt(j)){
                    i++;
                    j--;
                }else{
                  break;
                }
                
            }
            System.out.println(j - i + 1);
        }
        sc.close();
    }
    
}
