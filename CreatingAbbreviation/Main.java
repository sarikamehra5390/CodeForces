package CreatingAbbreviation;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            boolean[] available = new boolean[26];

            for(int i = 0 ; i < n ; i++){
                String word = sc.next();
                char first = word.charAt(0);

                available[first - 'a'] = true;
            }

            boolean possible = true;

            for(int i = 0 ; i < m ; i++){
                String abbreviation = sc.next();

                for(int j = 0 ; j < abbreviation.length(); j++){
                    char ch = abbreviation.charAt(j);

                    if(!available[ch - 'A']){
                        possible = false;
                    }
                }
            }

            if(possible){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
        sc.close();
    }
}