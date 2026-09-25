package FashionableArray;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            TreeMap<Integer, Integer> map =
                    new TreeMap<>(Collections.reverseOrder());

            for(int x : arr){
                map.put(x, map.getOrDefault(x, 0) + 1);
            }

            ArrayList<Integer> finalArray = new ArrayList<>();

        //    // how many times each element has alreay been used
        //    HashMap<Integer, Integer> used = new HashMap<>();

        //    for(int key : map.keySet()){
        //      used.put(key, 0);
        //    }

        //    for(int step = 0 ; step < n ; step++){
        //     // find current mode
        //     int maxFreq = -1;
        //     int mode = -1;

        //     for(int key : map.keySet()){

        //         int count = used.get(key);

        //         if(count > maxFreq){
        //             maxFreq = count;
        //             mode = key;
        //         }
        //     }


        //     // if current mode still has copies left
        //     // use it again 
        //     if(used.get(mode) < map.get(mode)){
        //         finalArray.add(mode);
        //         used.put(mode, used.get(mode) + 1);
        //     }else{
        //         // current mode is exhausted
        //         // find the minimum current freq
        //         int  minFreq = Integer.MAX_VALUE;
        //         int best = -1;

        //            for (int key : map.keySet()) {

        //                 if (used.get(key) < map.get(key)) {

        //                     int count = used.get(key);

        //                     if (count < minFreq) {
        //                         minFreq = count;
        //                         best = key;
        //                     }
        //                 }
        //             }

        //             finalArray.add(best);
        //             used.put(best, used.get(best) + 1);
        //     }
        //    }

          while(!map.isEmpty()){
            // largest remaining elements
            int largest = map.firstKey();

            // number of copies of it 
            int count = map.get(largest);

            // add all copies of largest 
            for(int i = 0 ; i < count ; i++){
                finalArray.add(largest);
            }

            map.remove(largest);

            // give every smaller elements at most 'count ' copies

            ArrayList<Integer> remove = new ArrayList<>();

            for(int key : map.keySet()){
                int take = Math.min(map.get(key), count);

                for(int i = 0 ; i < take ; i++){
                    finalArray.add(key);
                }

                int remaining = map.get(key) - take;

                if(remaining == 0){
                    remove.add(key);
                }else{
                    map.put(key, remaining);
                }
            }

            // remove elements whose copies are finished
            for(int key : remove){
                map.remove(key);
            }
          }


            // Print answer
            for(int x : finalArray){
                System.out.print(x + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}