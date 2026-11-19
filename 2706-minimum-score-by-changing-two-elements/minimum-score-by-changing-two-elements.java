class Solution {
    public int minimizeSum(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
       int min=Integer.MAX_VALUE;

       min=Math.min(min,arr[n-1]-arr[2]);

       min=Math.min(min,arr[n-2]-arr[1]);
       min=Math.min(min,arr[n-3]-arr[0]);

       return min;

    }
}