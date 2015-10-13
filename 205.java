//2.205 Isomorphic Strings
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map1.get(s.charAt(i))==null)
               map1.put(s.charAt(i),t.charAt(i));
            else if(map1.get(s.charAt(i)).charValue()!=t.charAt(i))
              return false;
            if(map2.get(t.charAt(i))==null)
               map2.put(t.charAt(i),s.charAt(i));
            else if(map2.get(t.charAt(i)).charValue()!=s.charAt(i))
              return false;
        }
       return true;
    }
}