//Excel Sheet Column Title 2.168
public class Solution {
    public String convertToTitle(int n) {
     String[] map={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
     n--;
     if(n<26) return map[n];
     int d;
     StringBuilder s=new StringBuilder();
     while(true){
         if(n<26) {
             s.insert(0,map[n]);
             break;
         }
         else{
              d=n%26;
               n=n/26-1;
             s.insert(0,map[d]);
         }       
     }
     return s.toString();
    }
}