class NumArray {
    int[] res;
    public NumArray(int[] nums) {
        res=nums;
    }
    
    public int sumRange(int left, int right) {
        int ans=0;
        for(int i=left;i<=right;i++){
            ans+=res[i];
        }
        return ans;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */