//Single Number 2.136
public class Solution {
    public int singleNumber(int[] nums) {
        int m=0;
        for(int i=0;i<nums.length;i++)
            m=m ^ nums[i];
        return m;
    }
}