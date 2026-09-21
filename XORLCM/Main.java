package XORLCM;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long c = sc.nextLong();

            long a = c;
            long b = c << 30;

            System.out.println(a + " " + b);
        }

        sc.close();
    }
}