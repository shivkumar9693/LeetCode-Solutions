class Solution {
    public long gcdSum(int[] nums) {
        int max=nums[0];
        int[] prefix=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            prefix[i]=gcd(nums[i],max);
        }
        Arrays.sort(prefix);
        int i=0;
        int j=prefix.length-1;
        long sum=0;
        while(i<j){
            sum+=(long)gcd(prefix[i],prefix[j]);
            i++;
            j--;
        }
        return sum;
    }
    int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}