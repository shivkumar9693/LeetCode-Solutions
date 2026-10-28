class Solution {
    int binary(int[] arr,int start,int end,int target){
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;

    }
    public int[] twoSum(int[] numbers, int target) {
         int n=numbers.length;
        for(int i=0;i<n;i++){
            int need=target-numbers[i];
            int find=binary(numbers,i+1,n-1,need);
            if(find!=-1){
                return new int[]{i+1,find+1};
            }
             
        }
        return new int[]{-1,-1};
    }
}