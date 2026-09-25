package AndOrSort;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
        int n = sc.nextInt();
        String s = sc.next();

        // if the string starts with 1 and contains 0 , all those 0s must be changed to 1
        if(s.charAt(0) == '1'){
            int ans = 0 ;

            for(int i = 0 ; i < n ; i++){
                if(s.charAt(i) == '0'){
                    ans++;
                }
            }

            System.out.println(ans);
        }


        // string starts with 0 
        else{
            int totalZeroes = 0 ;

            for(int i = 0 ; i < n ; i++){
                if(s.charAt(i) == '0'){
                    totalZeroes++;
                }
            }

            int ones = 0 ;
            int zeroes = totalZeroes;
            int ans = n ;

            for(int i = 0 ; i < n ; i++){
                if(s.charAt(i) == '0'){
                    zeroes--;
                }else{
                    ones++;
                }

                // make everthing upto i = 0 
                // and everthing after i = 1
                ans = Math.min(ans, ones + zeroes);
            }
            System.out.println(ans);
        }

    }
    sc.close();
}
    
}
