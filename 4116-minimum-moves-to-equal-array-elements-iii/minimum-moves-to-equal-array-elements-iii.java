class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MIN_VALUE;
        int ans=0;
        for(int num:nums){
            min=Math.max(min,num);
        }
        for(int num:nums){
            ans+=min-num;
        }
        return ans;
    }
}