class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        int curr=1;
        while(true){
            if(!set.contains(k*curr)){
                break;
            }
            curr++;
        }
        return k*curr;
    }
}