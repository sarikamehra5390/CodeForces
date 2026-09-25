package ThreePiles;
import  java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- >0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            if(Math.abs((a + c ) -  b) > Math.abs(a - b)){
                System.out.println(Math.abs((a + c) - b));
            }

            else{
                System.out.println(Math.abs(a - b));
            }
            
        }
        sc.close();
    }
}
