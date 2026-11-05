class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int i=0;
        int count=0;
        while(i<arr1.length){

            int curr=arr1[i];
            boolean flag=false;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(curr-arr2[j])<=d){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                count++;
            }
            i++;
        }
        return count;
    }
}