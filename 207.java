//207 Course Schedule
public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        boolean[] visited=new boolean[numCourses];
        boolean[] tmp=new boolean[numCourses];
        Arrays.fill(visited,false);
        Arrays.fill(tmp,false);
        for(int i=0;i<prerequisites.length;i++){
            ArrayList<Integer> list=map.get(prerequisites[i][1]);
            if(list==null) map.put(prerequisites[i][1],new ArrayList<Integer>());
            map.get(prerequisites[i][1]).add(prerequisites[i][0]);
            
        }
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
             if (!visit(i,visited,tmp,map))
                return false;
            }
        }
        return true;
    }
   public boolean visit(int i,boolean[] visited,boolean[] tmp,HashMap<Integer,ArrayList<Integer>> map){
       if(tmp[i]) return false;
       if(!visited[i]){
           tmp[i]=true;
           if(map.get(i)!=null)
             for(Integer m:map.get(i))
               if(!visit(m.intValue(),visited,tmp,map)) return false;
          tmp[i]=false;
          visited[i]=true;
       }
      
        return true;
   }
}