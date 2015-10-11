//2.228 Summary Ranges
public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result=new ArrayList<>();
        if(nums.length==0) return result;
        int start=nums[0];
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1 || nums[i]<nums[i+1]-1){
                if(nums[i]==start) result.add(""+start);
                else result.add(""+start+"->"+nums[i]);
                if(i<nums.length-1)
                 start=nums[i+1];
            }
        }
        return result;
    }
}