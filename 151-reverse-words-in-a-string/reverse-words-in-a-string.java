class Solution {
    public String reverseWords(String s) {
        String[] arr=s.trim().split("\\s+");

        String res="";
        for(int i=arr.length-1;i>=0;i--){
            if(i>0){
                 res+= arr[i]+" ";
            }
            else{
                res+=arr[i];
            }
           
        }
        return res;
    }
}