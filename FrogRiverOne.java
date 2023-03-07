// you can also use imports, for example:
import java.util.*;
import java.util.Map.Entry;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
        // Implement your solution here
        HashMap<Integer, Integer> leaves = new HashMap<Integer, Integer>();
        int minTime = 0;

        for(int i=0; i<A.length; i++){
            if(!leaves.containsKey(A[i])){
                leaves.put(A[i], i);
            }

        }

        for(int i=1; i<=X; i++){
            if(leaves.get(i) == null) return -1;
        }

        // Print values
        for (int i : leaves.values()) {
            minTime = Math.max(minTime, i);
        }   
        
        return minTime;
    }
}