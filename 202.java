//Happy Number 2.202
public class Solution {
    public boolean isHappy(int n) {
        
      while(n>7){
        int next = 0;
        while(n>=1){
            int x=n%10;
            next+=x*x; 
            n/=10;
        }
        n = next;
    }
    return n==1;
    }
}