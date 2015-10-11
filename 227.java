//2.227 Basic Calculator II
public class Solution {
    public class Result{
        public int result;
        public int index;
        public Result(int result, int index){
            this.result=result;
            this.index=index;
        }
    } 
    
    public int calculate(String s) {
      int i=0;
      int operand=0;
      int result=0;
      int sign=1;
      for(i=0;i<s.length();i++){
          if(s.charAt(i)<='9' && s.charAt(i)>='0')
             operand=operand*10+s.charAt(i)-48;
         
             
           else if(s.charAt(i)=='+') {
               result+=operand*sign;
              operand=0;
             sign=1;
          }
           else if(s.charAt(i)=='-'){
             result+=operand*sign;
             operand=0;
             sign=-1;
          }
          else if(s.charAt(i)=='*' || s.charAt(i)=='/'){
              Result r=parseMD(s,i,operand);
              operand=r.result;
              i=r.index;
           }
          
         
      }
       return result+operand*sign;
    }
      public Result parseMD(String s,int start,int firstOperand){
          int result=1;
          int operand=firstOperand;
          int MorD=1;
          int i;
          for( i=start;i<s.length();i++){
              if(s.charAt(i)<='9' && s.charAt(i)>='0')
                 operand=operand*10+s.charAt(i)-48;
              else if(s.charAt(i)==' ');
              else{
                if(MorD==1) result*=operand;
                else result/=operand;
                operand=0;
                if(s.charAt(i)=='+' || s.charAt(i)=='-') return new Result(result,i-1);
                if(s.charAt(i)=='*') MorD=1;
                if(s.charAt(i)=='/') MorD=0;
              }
              
          }
          return new Result( (MorD==1?result*operand: result/operand),i-1);
          
      }
  }