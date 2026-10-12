package CODEFORCES_PROBLEMS.Forked;
import java.util.*;

public class Main{
    static int[] dx = {-1, 1 , -1, 1};
    static int[] dy = {-1, -1, 1 ,1 };

    public static class Pair {
        long x;
        long y;
        
        public Pair(long x, long y){
          this.x = x; 
          this.y = y ;
        }

        @Override 
        public boolean equals(Object obj){
            if(this == obj) return true;
            if(!(obj instanceof Pair)) return false;

            Pair p = (Pair) obj;
            return x == p.x && y == p.y;
        }

        @Override 
        public int hashCode(){
            return Objects.hash(x, y);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();

            long xk = sc.nextLong();
            long yk = sc.nextLong();

            long xq = sc.nextLong();
            long yq = sc.nextLong();

            HashSet<Pair> kingHits = new HashSet<>();
            HashSet<Pair> queenHits = new HashSet<>();

            for(int i = 0 ; i < 4 ; i++){

                kingHits.add(new Pair(xk + dx[i] * a, yk + dy[i] * b));
                kingHits.add(new Pair(xk + dx[i] * b, yk + dy[i] * a));

                queenHits.add(new Pair(xq + dx[i] * a, yq + dy[i] * b));
                queenHits.add(new Pair(xq + dx[i] * b, yq + dy[i] * a));
            }

            int ans = 0 ;
            for(Pair positions : kingHits){
                if(queenHits.contains(positions))
                    ans++;
            }
                System.out.println(ans);
            
            
        }

        sc.close();
    }
}