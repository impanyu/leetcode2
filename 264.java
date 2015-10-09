//2.264 Ugly Number II
public class Solution {
    public int nthUglyNumber(int n) {
        int nth=1;
        LinkedList<Integer> l2=new LinkedList<Integer>();
        LinkedList<Integer> l3=new LinkedList<Integer>();
        LinkedList<Integer> l5=new LinkedList<Integer>();
        for(int i=1;i<=n-1;i++){
          l2.add(nth*2);
          l3.add(nth*3);
          l5.add(nth*5);
          nth=Math.min(l2.peek().intValue(),Math.min(l3.peek().intValue(),l5.peek().intValue()));
          if(nth==l2.peek().intValue()) l2.poll();
          if(nth==l3.peek().intValue()) l3.poll();
          if(nth==l5.peek().intValue()) l5.poll();
        }
        return nth;
    }
}