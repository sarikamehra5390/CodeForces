package MooLanguageSchool;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

           String str = sc.next();

           int schoolNeeded = 0 ;

           // check each farm 
           for(int i = 0 ; i < n ; i+=k ){
            boolean allOnes = true;

            // check k fields of this farm 

            for(int j = i ; j < i + k ;  j++){
                if(str.charAt(j) == '0'){
                   allOnes = false;
                   break;
                }
            }

            // if entire farm is 1 we need to use nhij farm 
            if(allOnes){
                schoolNeeded++;
            }
           }

           System.out.println(schoolNeeded);
        }
        sc.close();
    }
}