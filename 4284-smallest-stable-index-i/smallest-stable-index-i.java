class Solution {
    int min(int[] nums,int start,int end){
        int min=Integer.MAX_VALUE;
        for(int i=start;i<=end;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;

    }
     int max(int[] nums,int start,int end){
        int min=Integer.MIN_VALUE;
        for(int i=start;i<=end;i++){
            min=Math.max(min,nums[i]);
        }
        return min;

    }
    public int firstStableIndex(int[] nums, int k) {
        
        for(int i=0;i<nums.length;i++){
            int currMax =max(nums,0,i);
            int currMin=min(nums,i,nums.length-1);
            if((currMax-currMin)<=k)return i;
        }
        return -1;
    }
}