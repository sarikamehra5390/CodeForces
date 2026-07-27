package TargetPractise;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
           int score = 0 ;

           for(int i = 0 ; i < 10 ; i++){
            String s = sc.next();

            for(int j = 0 ; j < 10 ; j++){
                if(s.charAt(j) == 'X'){
                    int d = Math.min(Math.min(i , 9 - i), Math.min(j , 9 - j));
                    score += d + 1;
                }
            }
           }
           System.out.println(score);
        }
        sc.close();
    }
    
}
