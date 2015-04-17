//Maximum Gap 2.164
public class Solution {
    //method 1
    /*public int maximumGap(int[] num) {
        //5,3,1,6,2,10
        //1,2,3,5,6,10
        int size=num.length;
        if(size<=1) return 0;
        Arrays.sort(num);
        int max=-1;
        for(int i=1;i<size;i++){
            if(num[i]-num[i-1]>max)
               max=num[i]-num[i-1];
        }
        return max;
    }*/
    
    //method 2
    public int maximumGap(int[] num) {
        int size=num.length;
        if(size<=1) return 0;
        int mx=-1;
        int mn=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>mx) mx=num[i];
            if(num[i]<mn) mn=num[i];
        }
        
        int bucketSize=(mx-mn)/(size-1);
        if(bucketSize==0) bucketSize=1;
        int[] max=new int[(mx-mn)/bucketSize+1];
        int[] min=new int[(mx-mn)/bucketSize+1];
        Arrays.fill(max,-1);
        Arrays.fill(min,Integer.MAX_VALUE);
        
        for(int i=0;i<size;i++){
            int bucketIndex=(num[i]-mn)/bucketSize;
            if(num[i]>max[bucketIndex]) max[bucketIndex]=num[i];
            if(num[i]<min[bucketIndex]) min[bucketIndex]=num[i];
        }
        int maxGap=-1;
        int prev=-1;
        for(int i=0;i<(mx-mn)/bucketSize+1;i++)
           if(min[i]!=Integer.MAX_VALUE){  
              if ( prev!=-1 && min[i]-prev>maxGap) maxGap= min[i]-prev;
              prev=max[i];
           } 
        return maxGap;
    }
}