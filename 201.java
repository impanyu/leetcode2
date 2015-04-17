//Bitwise AND of Numbers Range 2.201
public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
       /*
        000001 1
        000010
        000011 3
        000100
        000101 5
        000110  
        000111 7  000110 
        001000
        001001   001000
        001010
        001011   001010
        001100
        001101
        001110*/
        int c=-1;
        int mm=m;
        int nn=n;
        //int k=m & n;
        //if(k==0) return 0;
        for(int i=31;i>=0;i--){
            if((nn & -2147483648)==-2147483648) {
                if((mm & -2147483648) !=-2147483648) return 0;
                else{
                   c=i;
                   break;
                }
            }
            mm=mm<<1;
            nn=nn<<1;
        }
        if(c==-1) return 0;
        
        int r=(int)Math.pow(2,c);
        
        return r + rangeBitwiseAnd(m-r,n-r);
    }
}