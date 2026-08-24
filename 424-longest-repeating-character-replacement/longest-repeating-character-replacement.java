class Solution {
    public int characterReplacement(String s, int k) {
       int max=1;
       int r=0,l=0;
       Map<Character,Integer>map=new HashMap<>();
        int maxFreq=0;

       while(r<s.length()){
            char curr=s.charAt(r);
        map.put(curr,map.getOrDefault(curr,0)+1);

        maxFreq=Math.max(maxFreq,map.get(curr));


        int rep=(r-l+1)-maxFreq;

        if(rep>k){
            char start=s.charAt(l);
            map.put(start,map.get(start)-1);
            l++;
        }

        max=Math.max(max,r-l+1);
        r++;
    


       }
       return max;
    }
}