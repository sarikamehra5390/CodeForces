package AlwaysChanging;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt(); // length of string s
            
            String s = "";
            for(char ch : s.toCharArray()){
                s  = sc.next();
            }

            StringBuilder sb = new StringBuilder();
            int removed = 0 ;

            sb.append(s.charAt(0));

            for(int i = 1 ; i < n ; i++){
                char ch = s.charAt(i);

                if(s.charAt(i - 1) != ch){
                       sb.append(ch);
                }
                else if(s.charAt(i - 1) == ch){
                    removed = (i - 1) + 1;
                    sb.delete(0, i - 1);
            
                    
                    sb.append(ch);
                }
            }

            System.out.println(n - removed);
        }

        sc.close();
    }
    
}
