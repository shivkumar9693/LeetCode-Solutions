class Solution {
     boolean freq(String s1,String s2){
         Map<Character,Integer>map1=new HashMap<>();
        for(char ch:s1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
         Map<Character,Integer>map2=new HashMap<>();
        for(char ch:s2.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        for(char ch:s1.toCharArray()){
            if(!map1.get(ch).equals(map2.get(ch))){
                return false;
            }
        }
        return true;
     }
    public boolean checkInclusion(String s1, String s2) {
       
        if (s1.length() > s2.length()) {
    return false;
}
        int l=0,r=0;
        StringBuilder sb=new StringBuilder();
        while(r<s1.length()){
            sb.append(s2.charAt(r));
            r++;
        }
        if(freq(s1,sb.toString())){
            return true;
        }

        while(r<s2.length()){
            if(!sb.isEmpty()){
                 sb.deleteCharAt(0);
            }
          
           
            sb.append(s2.charAt(r));
             r++;
            if(freq(s1,sb.toString())){
                return true;
            }


        }
        return false;


    }
}