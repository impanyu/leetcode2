
//2.287 Find the Duplicate Number
public class Solution {
    public int findDuplicate(int[] nums) {
        int high=nums.length-1;
        int low=1;
        while(low<high){
            int mid=(low+high)/2;
            int count=0;
            for(int n:nums)
                if(n<=mid) count++;
            if(count<=mid) low=mid+1;
            else high=mid;
        }
        return low;
    }
}