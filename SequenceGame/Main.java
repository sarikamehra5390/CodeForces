package SequenceGame;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            ArrayList<Integer> ans = new ArrayList<>();

            for (int i = 0; i < n; i++) {

                int x = sc.nextInt();

                if (i > 0 && ans.get(ans.size() - 1) > x) {
                    ans.add(1);
                }

                ans.add(x);
            }

            System.out.println(ans.size());

            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}