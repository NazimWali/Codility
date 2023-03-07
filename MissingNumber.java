// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        int missing = 0;
        int[] B = new int[A.length+2];
        B[0] = 1;

        for(int i=0; i<A.length; i++){
            B[A[i]] = 1;
        }

        for(int i=0; i<B.length; i++){
            if (B[i] < 1) return i;
        }

        return missing;
    }
}
