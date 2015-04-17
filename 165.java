//Compare Version Numbers 2.165
public class Solution {
    public int compareVersion(String version1, String version2) {
        //1234
        String[] v1=version1.split("\\.");//pay attension to this regular expression
        String[] v2=version2.split("\\.");
        int size1=v1.length;
        int size2=v2.length;
        for(int i=0;i<Math.min(size1,size2);i++){
            if(Integer.parseInt(v1[i])>Integer.parseInt(v2[i])) return 1;
            if(Integer.parseInt(v1[i])<Integer.parseInt(v2[i])) return -1;
        }
        if(size1>size2) {
            if(Integer.parseInt(v1[size2])>0) return 1;
            else return 0;
        }
        else if(size1==size2) return 0;
        else {
            if(Integer.parseInt(v2[size1])>0) return -1;
            else return 0;
        }
    }
}