class Solution {
    public int compress(char[] chars) {
        int i=0;
        int index=0;
        while(i<chars.length){
            char curr=chars[i];
            int count=0;

            while(i<chars.length && curr==chars[i]){
                i++;
                count++;
            }

            chars[index]=curr;
            index ++;
            if(count>1){
               String str = String.valueOf(count);

for (char ch : str.toCharArray()) {
    chars[index++] = ch;
}
            }

        }
        return index;
    }
}