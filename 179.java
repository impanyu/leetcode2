//Largest Number 2.179
public class Solution {
    public String largestNumber(int[] num) {
        String[] nums=new String[num.length];
        for(int i=0;i<=num.length-1;i++)
          nums[i]=String.valueOf(num[i]);
        Arrays.sort(nums,new StringComp());
        String result=new String();
        for(int i=nums.length-1;i>=0;i--)
        result+=nums[i];
        int index=0;
        for(int i=0;i<=result.length()-1;i++){
            if(result.charAt(i)=='0')
             index++;
            else
              break;
        }
        if(index==result.length())
         index--;
        return result.substring(index);   
    }
    
   public class StringComp implements Comparator<String>{
       public int compare(String a,String b){
           int size=Math.min(a.length(),b.length());
           for(int i=0;i<size;i++){
               if(a.charAt(i)>b.charAt(i))
                 return 1;
                else if(a.charAt(i)<b.charAt(i))
                 return -1;
           }
           if(a.length()==b.length())
             return 0;
           else if(a.length()<b.length()){
              String s=new String();
              s=s+b.substring(size);
              s=s+a;
              return b.compareTo(s);
           }
          else{
              String s=new String();
              s=s+a.substring(size);
              s=s+b;
              return s.compareTo(a);
           }
       }
   }
}