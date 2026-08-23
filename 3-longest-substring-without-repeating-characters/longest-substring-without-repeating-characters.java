class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0;
        Map<Character,Integer>map=new HashMap<>();
        int max=0;
        while(r<s.length()){
            char curr=s.charAt(r);
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);


            while(map.get(curr)>1){
             int val=   map.get(s.charAt(l));
             map.put(s.charAt(l),val-1);
             l++;
            }

            max=Math.max(max,r-l+1);
            r++;



        }
        return max;
    }
}