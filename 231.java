//231 Power of Two

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<0) return false;
        int count=0;
        for(int i=0;i<32;i++){
           if((n & 1) ==1)
             count++;
           // result=!result && ((n & 1) ==1) | result && ((n & 1) !=1);
            n=n>>1;
        }
        return count==1;
    }
}