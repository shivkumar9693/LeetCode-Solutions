class Solution {
    public long sumAndMultiply(int n) {
        String curr=String.valueOf(n);

        curr=curr.replace("0","");
        if(!curr.isEmpty()){
             Long rem=Long.valueOf(curr);
              return  rem*(sum(rem));
        }
       
return 0;
       


    }

    public int sum(Long n){
        int ans=0;
        while(n>0){
            ans+= n%10;
            n=n/10;
        }
        return ans;
    }
}