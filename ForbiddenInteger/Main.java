package ForbiddenInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0 ){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            
            // case 1 : 1 is allowed
            if(x != 1){
                System.out.println("Yes");
                System.out.println(n);

                for(int i = 0 ; i < n ; i++){
                    System.out.print(1 + " ");
                }
                System.out.println();
            }

            // case 2 : 1 is forbidden
            else{
                // only number 1 exists, impossible
                if(k == 1){
                    System.out.println("No");
                }
                // n is even -> use only 2's
                else if(n % 2 == 0){
                    System.out.println("Yes");
                    System.out.println(n / 2);

                    for(int i = 0 ; i < n / 2 ; i++){
                        System.out.print(2 + " ");
                    }
                    System.out.println();
                }
                // n is odd
                else{
                    // cannot use 3
                    if(k == 2){
                        System.out.println("No");
                    }

                    // use one 3 and rest 2's
                    else{
                        System.out.println("Yes");
                        System.out.println((n - 3) / 2 + 1);

                        System.out.println(3 + " ");

                        for(int i = 0 ; i < (n - 3) / 2; i++){
                            System.out.print(2 + " ");
                        }
                        System.out.println();
                    }
                }
            }
           
        }
        sc.close();
    }
}