//2.223 Rectangle Area
public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1=(C-A)*(D-B);
        int area2=(G-E)*(H-F);
        if(A>G || E>C || B>H || F>D) return area1+area2;
        int[] x=new int[4];
        int[] y=new int[4];
        x[0]=A;
        x[1]=C;
        x[2]=E;
        x[3]=G;
        y[0]=B;
        y[1]=D;
        y[2]=F;
        y[3]=H;
        Arrays.sort(x);
        Arrays.sort(y);
        return area1+area2-(x[2]-x[1])*(y[2]-y[1]);
    }
}