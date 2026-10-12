package CODEFORCES_PROBLEMS.TheNightWalk;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            
            Long n = sc.nextLong();
            Long L = sc.nextLong();
            Long T = sc.nextLong();

            long answer = 0 ;

            Long period = 2 * L ;

            Long cycles = T / period;
            Long rem = T % period;

            for(int i = 0 ; i < n ; i++){
                int x = sc.nextInt();
            

            if(x == 0){
                answer +=  cycles + 1;
            }
            else if(x == L){
                answer += cycles;

                if(rem >= L){
                    answer++;
                }
            }else{
                // if the bag is in the corriodor

                answer += 2 * cycles;

                if(rem >= x){
                    answer++;
                }

                Long returnTime = period - x;

                if(rem >= returnTime){
                    answer++;
                }
            }

            }

            System.out.println(answer);
        }

        sc.close();

    }
}