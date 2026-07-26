package DontTryToCount;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt(); // length of string x
            int m = sc.nextInt(); // length of string s

            String x = sc.next();
            String s = sc.next();

           int operations = 0 ;
           boolean found = false;

           // at most 6-7 doublings are enough for the given constraint
           for(int i = 0 ; i <= 6 ; i++){

            if(x.contains(s)){
                System.out.println(operations);
                found = true;
                break;
            }
            x += x;
            operations++;
           }
           if(!found){
            System.out.println(-1);
           }
        }
        sc.close();
    }
}