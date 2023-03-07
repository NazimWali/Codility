// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        int spi = 1;

        Set<Integer> occur = new HashSet<Integer>();

        for(int i=0; i<A.length; i++){
            if(!occur.contains(A[i])) occur.add(A[i]);
        }

        for(int i=1; i<=A.length+1; i++){
            if(!occur.contains(i)) return i;
        }

        return spi;
    }
}