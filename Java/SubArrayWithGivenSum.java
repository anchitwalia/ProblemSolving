// Given an unsorted array of nonnegative integers, 
// find a continous subarray which adds to a given 
// number.

public class SubArrayWithGivenSum {
    public void solution(int[] A, int sum) {
      int currSum = A[0];
      int starti = 0;
      for(int i = 1; i <= A.length; i++) {
        while(currSum > sum && starti < i - 1) {
          currSum = currSum - A[starti];
          starti++;
        }
        if(currSum == sum) {
          System.out.println(starti + " " + (i - 1));
          return;
        }
        if(i < A.length) {
          currSum += A[i];
        }
      }
      System.out.println(-1);
      return;
    }
}
