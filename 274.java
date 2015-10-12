//2.274 H-Index
public class Solution {
    public int hIndex(int[] citations) {
        //4 3 2 1 0 
        Arrays.sort(citations);
    
        for(int i=0;i<citations.length;i++){
            if(citations.length-i<=citations[i]){
                if(i==0) return citations.length;
                else if(citations.length-i>=citations[i-1]) 
                   return citations.length-i;
            }
        }
        return 0;
    }
}