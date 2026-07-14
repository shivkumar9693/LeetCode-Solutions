class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>max=new PriorityQueue<>(Collections.reverseOrder());

        for(int num:nums){
            max.add(num);
        }
        while(k>1){
            max.poll();
            k--;
        }
        return max.peek();


      
    }
}