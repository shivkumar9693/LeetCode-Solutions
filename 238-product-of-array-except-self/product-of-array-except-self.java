class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre=new int[nums.length];
        int [] post=new int[nums.length];

        int ans=1;
        for(int i=0;i<nums.length;i++){
            ans *=nums[i];
            pre[i]=ans;
        }

        int postAns=1;
        for(int i=nums.length-1;i>=0;i--){
            postAns *= nums[i];
            post[i]=postAns;
        }


        for(int i=0;i<nums.length;i++){

            if(i>0 && i<nums.length-1){
                 nums[i]= pre[i-1]*post[i+1];
            }else if(i==0){
                nums[i]=post[i+1];
            }else if(i==nums.length-1){
                nums[i]=pre[i-1];
            }
           
        }
        return nums;
    }
}