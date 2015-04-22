//Repeated DNA Sequences 2.187
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<String> l=new ArrayList<>();
        int v=0;
        for(int i=0;i<s.length();i++){
            //String sub=s.substring(i,i+9);
            v=v<<3 &0x3FFFFFFF | (s.charAt(i) & 7);
            if(map.get(v)==null)
               map.put(v,1);
            else if(map.get(v)==1){
                if(i>=9) l.add(s.substring(i-9,i+1));
                map.put(v,2);
            }     
        }       
        return l;
    }
}