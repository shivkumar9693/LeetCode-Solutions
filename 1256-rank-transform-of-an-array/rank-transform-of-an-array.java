class Solution {
    public int[] arrayRankTransform(int[] arr) {
         int res[]=new int[arr.length];
         int j=0;
         for(int num:arr){
            res[j++]=num;

         }
         Arrays.sort(res);
         Map<Integer,Integer>map=new HashMap<>();
         int rank=1;
         for(int num:res){
            if(!map.containsKey(num)){
                map.put(num,rank);
                rank++;
            }
         }

        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}