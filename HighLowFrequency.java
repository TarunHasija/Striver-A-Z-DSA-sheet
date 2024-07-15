import java.util.HashMap;
import java.util.Map;


class HighLowFrequency{

    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 2, 6, 7, 5, 3, 3, 4, 3, 6, 2, 5, 5};
        
        HashMap<Integer,Integer> occMap = new HashMap<>();
        for (int i : arr) {
            occMap.put(i,occMap.getOrDefault(i, 0)+1);
        }
        
        int high = Integer.MIN_VALUE;
        int low = Integer.MAX_VALUE;
        int high_index =0;
        int low_index =0;

        for ( Map<Integer,Integer> entry  : occMap.entrySet()) {
            
        }


    }
}