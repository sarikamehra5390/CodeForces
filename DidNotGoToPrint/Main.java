package DidNotGoToPrint;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0 ){
            int n = sc.nextInt();

            String s = sc.next();
            Stack<Integer> st = new Stack<>();

            boolean[] printed = new boolean[n + 1];

            for(int i = 0 ; i < n ; i++){
                  char ch = s.charAt(i);

                if(ch == '1'){
                    st.push(i + 1);
                }
                else if(ch == '2'){
                   if(!st.isEmpty()) {
                    int doc = st.pop();
                    printed[doc] = true;

                   }else{
                       printed[i + 1] = true;
                   }

                }else if(ch == '3'){
                    printed[i + 1] = true;
                }
            }

            int count = 0 ;

            for(int i = 1 ; i <= n ; i++){
                if(!printed[i]){
                    count++;
                }
            }

            System.out.println(count);
        

            for(int i = 1 ; i <=n ; i++){
             if(!printed[i]){
                System.out.print(i + " ");
             }
            }

            System.out.println();
        }


        sc.close();
    }
    
}
