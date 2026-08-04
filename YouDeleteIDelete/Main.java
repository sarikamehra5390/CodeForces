package YouDeleteIDelete;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){

            String s = sc.next();
            int n = s.length();

            int zeroPos = -1;

            // Alice deletes the first 0 to make the string lexographically larger
            for(int i = 0 ; i < n ; i++){
                if(s.charAt(i) == '0'){
                    zeroPos = i;
                    break;
                }
            }

            // build string after alice's move

            StringBuilder afterAlice = new StringBuilder();

            for(int i = 0 ; i < n ; i++){
                if(i != zeroPos){
                    afterAlice.append(s.charAt(i));
                }
            }

            // Bob deletes the first occuence of 1 to make the string lexographically smaller
            int onePos = -1;

            for(int i = 0; i < afterAlice.length(); i++){
                if(afterAlice.charAt(i) == '1'){
                    onePos = i;
                    break;
                }
            }

            // build final answer 
            StringBuilder ans = new StringBuilder();

            for(int i = 0 ; i < afterAlice.length(); i++){
                if(i != onePos){
                    ans.append(afterAlice.charAt(i));
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
