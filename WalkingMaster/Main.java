package WalkingMaster;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0 ){
            int sourceX = sc.nextInt();
            int sourceY = sc.nextInt();
            int destX = sc.nextInt();
            int destY = sc.nextInt();

            if(destY < sourceY){
                System.out.println(-1);
                continue;
            }

            int moves = destY - sourceY;

            sourceX += moves;

            if(sourceX < destX){
                System.out.println(-1);
                continue;
            }

            moves += (sourceX - destX);
            System.out.println(moves);
        }

        sc.close();
    }
    
}
