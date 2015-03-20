//Majority Elements 2.169
public class Solution {
    public int majorityElement(int[] num) {
       Arrays.sort(num);
       int count=1;
       int maxcount=0;
       int majority=num[0];
       for(int i=2;i<num.length;i++){
           if(num[i]==num[i-1])
             count++;
           else{ 
             if(maxcount<count){
              maxcount=count;
              majority=num[i-1];
             }
             count=1;
           }
       }
        if(maxcount<count)
              majority=num[num.length-1];
       return majority;
    }
}