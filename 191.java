//Number of 1 Bits 2.191
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        int i=32;
      while(i>=1){
          if((n & 1)==1)
            count++;
          n=n>>>1;
          i--;
      }
      return count;
    }
}