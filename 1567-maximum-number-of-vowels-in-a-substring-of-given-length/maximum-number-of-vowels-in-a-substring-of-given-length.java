class Solution {
    boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int max=0;
            int vowel=0;
        int r,l=0;
        for(r=0;r<k;r++){
            if(isVowel(s.charAt(r))){
                vowel++;
            }
        }
        max=Math.max(max,vowel);
        while(r<s.length()){
           if( isVowel(s.charAt(l))){
                vowel--;
            }
            l++;

           if(isVowel(s.charAt(r))){
                vowel++;
            }
            r++;
            max=Math.max(max,vowel);
        }
        return max;
    }
}