// you can also use imports, for example:
import java.util.*;
import java.util.Map.Entry;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        int odd = 0;
        HashMap<Integer, Integer> numCount = new HashMap<Integer, Integer>();

        //if array size = 1, just return that number
        if(A.length == 1){
            return A[0];
        }

        //otherwise, count number of appearances
        //of each number
        for(int i=0; i< A.length; i++){
            if(!(numCount.containsKey(A[i]))){
                numCount.put(A[i], 1);
            }
            else numCount.put(A[i], numCount.get(A[i]) + 1);
        }

        //then, go through all counts and find the one
        //that is odd
        for (int i : numCount.values()) {
            if(i%2 != 0) odd = i;
        }

        //match that odd count with the value and return that value
        for(Entry<Integer, Integer> entry: numCount.entrySet()) {

            // if give value is equal to value from entry
            // print the corresponding key
            if(entry.getValue() == odd) {
                return entry.getKey();
            }
        }

        return odd;
    }
}