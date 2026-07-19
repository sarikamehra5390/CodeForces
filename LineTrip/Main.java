package LineTrip;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   // number of test cases
        while (t-- >0) {
            long n  = sc.nextLong(); // number of gas stations
            long x = sc.nextLong(); // destination point 
            
            // list to store start point, gas station points and destination point

            List<Long> pointsList = new ArrayList<>();
            pointsList.add(0L); // added start point 0 to the list of points

            for (int i = 0; i < n; i++) {
                pointsList.add(sc.nextLong()); // add gas station points to the list
            }

            pointsList.add(x); // add destination point x to the list of points

            // update n to include start point and destination point with gas stations
            n = pointsList.size();

            // this is the variable to store the maximum distance between two points in the list

            long maxDistanceBtwPoints = Long.MIN_VALUE;


            // loop through the list of points to find the maximum distance between two consecutive points
            for (int i = 1; i < n; i++) {
                if(i == n - 1){
                // if it is the last point in the list, then we need to consider the distance between the last gas station and the destination point, which is double the distance between them  
                maxDistanceBtwPoints = Math.max(maxDistanceBtwPoints, 2 *(pointsList.get(i) - pointsList.get(i - 1)));
            }else{
                // consider the distance between two consecutive points in the list one way 
                maxDistanceBtwPoints = Math.max(maxDistanceBtwPoints, pointsList.get(i) - pointsList.get(i - 1));
            }
        }
        System.out.println(maxDistanceBtwPoints);
        }

        sc.close();
    
        // the key observation:
    //The tank capacity only needs to be large enough to cover the longest distance you must travel without refueling.
     }
    
}
