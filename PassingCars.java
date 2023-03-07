// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        int pairs = 0;
        int counter = 0;

        /*for(int i=0; i<A.length; i++){
            if(A[i] == 0){
                for(int j=i+1; j<A.length; j++){
                    if(A[j] == 1){
                        pairs++;
                        if(pairs >= 1000000000) return -1;
                    }
                }
            }
        }*/

        for(int i=0; i<A.length; i++){
            if(A[i] == 0){
                counter++;
            }
            else{
                pairs+= counter;
                if(pairs >= 1000000000) return -1;
            }
        }


    return pairs;
    }
}