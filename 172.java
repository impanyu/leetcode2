//Factorial Trailing Zeroes 2.172
public class Solution {
    public int trailingZeroes(int n) {
      int nOfFive=0;
      int k=n/5;
      while(k>=1){
         nOfFive+=k;
         k/=5;
      }
      return nOfFive;
    }
}