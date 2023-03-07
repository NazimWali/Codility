// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        int firstSum = 0;
        int secondSum = 0;
        int difference = 0;
        int minDifference = Integer.MAX_VALUE;

        if(A.length == 2){
            return Math.abs(A[0] - A[1]);
        }

        for(int p=1; p<A.length; p++){
            for(int i=0; i<=p-1; i++){
                firstSum += A[i];
            }
            for(int i=p; i<A.length; i++){
                secondSum += A[i];
            }
            difference = Math.abs(firstSum - secondSum);

            minDifference = Math.min(minDifference, difference);
            firstSum = secondSum = 0;

        }

        return minDifference;
    }
}
