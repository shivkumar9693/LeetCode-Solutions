class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer>map=new HashMap<>();

        int l=0,r=0;
        int max=0;

        while(r<s.length()){
            char curr=s.charAt(r);
            map.put(curr,map.getOrDefault(curr,0)+1);
            while(map.get(curr)>2 && l<r){
                 char currL=s.charAt(l);
                    map.put(currL,map.get(currL)-1);
                
                l++;
            } 
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}