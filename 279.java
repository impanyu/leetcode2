//2.279 Perfect Squares
public class Solution {
    public int numSquares(int n) {
         int[] mins=new int[n+1];
         Arrays.fill(mins,n);
         mins[0]=0;
          for(int i=0;i<=n;i++){
              int k=1;
              while(i+k*k<=n){
                  if(mins[i+k*k]>mins[i]+1)
                    mins[i+k*k]=mins[i]+1;
                  k++;
              }
          }
          return mins[n];
    }
}