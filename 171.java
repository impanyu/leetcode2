//Excel Sheet Column Number 2.171
public class Solution {
    public int titleToNumber(String s) {
        int size=s.length();
        int result=0;
        int p=1;
        for(int i=size-1;i>=0;i--){
            char a=s.charAt(i);
            result+=(a-65+1)*p;
            p*=26;
        }
        return result;
    }
}