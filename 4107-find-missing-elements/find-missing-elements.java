class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        Set<Integer>set=new HashSet<>();
        List<Integer>list=new ArrayList<>();
        for(int num:nums){
            set.add(num);

        }
        int i=nums[0];
        int j=nums[nums.length-1];
        while(i<j){
            if(!set.contains(i+1)){
                list.add(i+1);
            }
            i++;
        }
        
            
        
        return list;
    }
}