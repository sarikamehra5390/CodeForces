package Evanescent;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            // count original groups 
            int groups = 1;
            for(int i = 1 ; i < n ; i++){
                if(s.charAt(i) != s.charAt(i - 1)){
                    groups++;
                }
            }
            int ans = Integer.MAX_VALUE;

            // Delete every valid character (not first or last)
            for(int i = 1 ; i <= n - 2 ; i++){
                
                int leftBoundary = (s.charAt(i - 1) != s.charAt(i)) ? 1 : 0;
                int rightBoundary = (s.charAt(i) != s.charAt(i + 1)) ? 1 : 0;
                int newBoundary = (s.charAt(i - 1) != s.charAt(i + 1)) ? 1 : 0;

                int newGroups = groups - leftBoundary - rightBoundary + newBoundary;
                ans = Math.min(ans , newGroups);
            }
            System.out.println(ans);
        }

        sc.close();
    }
    
}
