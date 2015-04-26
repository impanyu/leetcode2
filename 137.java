//Single NumberII 2.137
public class Solution {
    public int singleNumber(int[] nums) {
        int a=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
           int t=(~a&nums[i]&~c) | (a&~nums[i]&~c);
           c=(a&nums[i]&~c) | (~a&~nums[i]&c);
           a=t;
        }
        return a;
    }
}  