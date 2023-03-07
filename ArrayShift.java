// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // Implement your solution here
        // Cases wehre array is of size 1 or less
        // Or where 0 rotations are made, just return A
        if( (A.length <= 1) || (K == 0) ){
            return A;
        }

        // For i = k number of rotations
        // save last entry in array in temp int
        // shift over every value in array
        // once at beginning index, store in temp
        // then return array
        for(int i=0; i<K; i++){
            int temp = A[A.length-1];
            for(int j = A.length-1; j>0; j--){
                A[j] = A[j-1];
            }
            A[0] = temp; 
        }

        return A;
    }
}