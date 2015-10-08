//219.Contains Duplicate II
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer index=map.get(nums[i]);
            if(index==null || i-index.intValue()>k) map.put(nums[i],i);
            else return true;
        }
        return false;
    }
}