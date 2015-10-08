//Find Peak Element 2.162
public class Solution {
    public int findPeakElement(List<Integer> nums) {
        int size=nums.size();
        if(size==0) return -1;
        int l=0;
        int r=size-1;
        int mid;
        while(l<r){
            mid=(l+r)/2;
            if(nums.get(mid)<nums.get(mid+1)) l=mid+1;
            else if(mid==0 || nums.get(mid)>nums.get(mid-1)) return mid;
            else r=mid-1;
        }
        return l;
    }
} 