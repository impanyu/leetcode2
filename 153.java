//Find Minimum in Rotated Sorted Array 2.153
public class Solution {
   /*  method 1 O(n)
     public int findMin(List<Integer> nums) {
        int size=nums.size();
       if(size==0) return -1;
       int first=nums.get(0);
       int prev=first;
       for(int i=1;i<size;i++){
           int cur=nums.get(i);
           if(cur<prev)  return cur;
           prev=cur;
           
       }
       return first;
    }*/
    //method 2 O(log(n))
    public int findMin(List<Integer> nums){
       int size=nums.size();
       if(size==0) return -1;
       int l=0;
       int r=size-1;
       if(nums.get(l)<nums.get(r))  return nums.get(l);
       while(l<r){
          int mid=(l+r)/2;
          if(nums.get(mid)<nums.get(r)) r=mid;
          else l=mid+1;
       }
       return nums.get(l);
    }
    
}