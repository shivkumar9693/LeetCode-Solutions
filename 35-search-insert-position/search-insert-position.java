class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0,end=nums.length-1;
      for(int i=0;i<nums.length;i++){
        int mid=(start+end)/2;
        if(nums[mid]>target){
            end= mid-1;
        }
        else if(nums[mid]==target){
            return mid;

        }
        else{
            start= mid+1;
        }
      } 
      return start; 
    }
}