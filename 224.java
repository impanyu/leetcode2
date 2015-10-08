//224 Basic Calculator

public class Solution {
    public class Result{
        public int index;
        public int sum;
        public Result(int index,int sum){
            this.index=index;
            this.sum=sum;
        }
    }
    public int calculate(String s) {
          return eval(s,0).sum;
    }
    
   public Result eval(String s, int index){
         int sum=0;
         int sign=1;
         int i;
         int value=0;
        for( i=index;i<s.length();i++){
           if(s.charAt(i)<='9' && s.charAt(i)>='0')
              value=value*10+s.charAt(i)-48;
            else{
                 sum+=value*sign;
                 value=0;
                  if(s.charAt(i)=='(')  {
                    Result result=eval(s,i+1);
                    sum+=result.sum*sign;
                    i=result.index;
                  }
                  else if(s.charAt(i)==')')  return new Result(i,sum);
                   else if(s.charAt(i)=='-')  sign=-1;
                  else if(s.charAt(i)=='+') sign=1;
            }        
        }
        return new Result(i-1,sum+value*sign);
   }    
    
}    