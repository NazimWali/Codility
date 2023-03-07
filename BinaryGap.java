// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int n) {
        // Implement your solution here
        int max = 0;
        int gap = 0;

        //Use this to find first '1' in binary representation
        //for example 34 = 100010, shift over until first '1' appears
        while ((n != 0) && (n&1) == 0){
            n >>>= 1;
        }

        //Now just count every gap
        //Any time a '1' is met, reset the gap
        //and check the max
        //when n = 0, end and return max
        while(n != 0){
            
            if((n&1) == 1){
                max = Math.max(max, gap);
                gap = 0;
            }
            else gap++;

            n >>>= 1;
        }

    return max;
    }
}