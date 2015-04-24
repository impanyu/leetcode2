//Unique Binary Search Trees 2.96
public class Solution {
    public int numTrees(int n) {
       int [] nums=new int[n+1];
        nums[0]=1;
        for(int i=1;i<=n;i++)
            for(int j=1;j<=i;j++)
               nums[i]+=nums[i-j]*nums[j-1];
        return nums[n];
    }
}