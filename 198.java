//House Robber 2.198
public class Solution {
    public int rob(int[] num) {
        if(num.length==0) return 0;
        int[] max=new int[num.length];
        int mx=-1;
        int pmx=-1;
        for(int i=0;i<num.length;i++){
           if(i==0)  max[i]=num[i];
           else if(i==1) max[i]=num[1];
           else max[i]=pmx+num[i];
           pmx=mx;
           mx=max[i]>mx?max[i]:mx;         
        }       
        return mx;
        
    }
}