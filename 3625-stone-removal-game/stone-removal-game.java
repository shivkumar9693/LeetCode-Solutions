class Solution {
    public boolean canAliceWin(int n) {
        if(n<10)return false;
       
        int curr=10;

        boolean alice=true;

        while(n>=curr){
            n=n-curr;
            curr=curr-1;
            alice =!alice;
        }

        
        return !alice;
        

         
    }
}