class Solution {
    int sum(int n){
        int ans=0;
        while(n>0){
            ans+=n%10;
            n=n/10;
        }
        return ans;
    }
    int pro(int n){
        int ans=1;
        while(n>0){
            ans*=n%10;
            n=n/10;
        }
        return ans;
    }
    public boolean checkDivisibility(int n) {
        int add=sum(n);
        int prod=pro(n);

        if(n%(add+prod)==0)return true;
        return false;
    }
}