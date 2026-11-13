class Solution {
    public int longestSubarray(int[] nums) {
         int max=0;
         int l=0,r=0;
         int zero=0;
         while(r<nums.length){
             if(nums[r]==0){
                zero++;
             }
             if(zero>1){
                while(zero>1){
                    if(nums[l]==0){
                        zero--;
                    }
                    l++;
                }
             }    
             max=Math.max(max,r-l);
             
             
           
             r++;
         }
         if(max==nums.length){
            return nums.length-1;
         }
         return max;
    }
}