//2.260 Single Number II
public class Solution {
    public int[] singleNumber(int[] nums) {
        int first=0;
        int second=0;
        int mask=1;
        int xor=0;
        for(int i=0;i<nums.length;i++)
           xor^=nums[i];
        for(int i=0;i<32;i++)
            if((mask & xor) ==0) mask=mask<<1;
            else break;
        for(int i=0;i<nums.length;i++)
            if((mask & nums[i]) ==0)
              first^=nums[i];
        second=first^xor;
       return new int[]{first,second};
    }
}