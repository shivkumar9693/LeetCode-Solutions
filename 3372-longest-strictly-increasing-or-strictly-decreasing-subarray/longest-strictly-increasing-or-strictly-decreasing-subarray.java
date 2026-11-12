class Solution {
    public int longestMonotonicSubarray(int[] nums) {
       

        int inc=1;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){

                if(nums[j-1]>=nums[j]){
                    break;
                }
                 inc=Math.max(inc,j-i+1);
            }
        }
        int dec=1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){

                if(nums[j-1]<=nums[j]){
                   
                    break;
                }
                 dec=Math.max(dec,j-i+1);
            
            }
        }
        return Math.max(inc,dec);
         
    }
}