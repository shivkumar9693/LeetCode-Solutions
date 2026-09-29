class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>max=new PriorityQueue<>(Collections.reverseOrder());

        for(int num:stones){
            max.offer(num);
        }

        while(max.size()>1){
            int first=max.poll();
            int sec=max.poll();
            if(first!=sec){
                max.offer(first-sec);
            }
        }
        return max.size()==0?0:max.peek();
    }
}