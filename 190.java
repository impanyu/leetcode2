//Reverse Bits 2.190
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
       int result=0;
       int i=1;
       while(i<=32){
           result=result | (n & 1);
           if(i<32)
           result = result << 1;
           n =n >>>1;
           i++;
       }
       return result;
    }
}