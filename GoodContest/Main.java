package GoodContest;
import java.util.*;

public  class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0 ){
            int n = sc.nextInt();
            int min = Integer.MAX_VALUE;

            for(int i = 0 ; i < 3 ; i++){
                 int x = sc.nextInt();

                 min = Math.min(min, x);
            }

            System.out.println(n - min);
        }
        sc.close();
    }

}