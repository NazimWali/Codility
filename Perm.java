// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // Implement your solution here

        Set<Integer> nums = new HashSet<Integer>();

        for(int i=0; i<A.length; i++){
            if(nums.contains(A[i])) return 0;
            else nums.add(A[i]);
        }

        for(int i=1; i<=A.length; i++){
            if(nums.contains(i)) nums.remove(i);
            if(nums.isEmpty()) return 1;
        }
    
    return 0;
    }
}