package Riptide;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int diff1 = Math.abs(a - b );
            int diff2 = Math.abs(b - c );
            int diff3 = Math.abs(c - a );

            int minRound = Math.min(diff1, Math.min(diff2, diff3));

            System.out.println(minRound);
         }

        sc.close();
    }
}