class Solution {
    public int[] runningSum(int[] nums) {
        int curr=nums[0];
        for(int i=1;i<nums.length;i++){
            curr=curr+nums[i];
            nums[i]=curr;

        }
        return nums;
    }
}