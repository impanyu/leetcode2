//2.290 Word Pattern
public class Solution {
    public boolean wordPattern(String pattern, String str) {
        Scanner scanner=new Scanner(str);
        int i=0;
        HashMap<Character,String> map1=new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();
        while(scanner.hasNext()){
            if(i==pattern.length()) return false;
           String sub=scanner.next();
           char c=pattern.charAt(i);
           
           if(map1.get(c)==null) map1.put(c,sub);
           else if(!map1.get(c).equals(sub)) return false;
           
           if(map2.get(sub)==null) map2.put(sub,c);
           else if(!map2.get(sub).equals(c)) return false;
           i++;
        }
        if(i<=pattern.length()-1) return false;
        return true;
    }
}