class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer>st=new Stack<>();
        int count=0;
        for(char ch:s.toCharArray()){
            if (ch == '(') {
    st.push(count);
    count = 0;
} else {
    int prev = st.pop();

    if (count == 0) {
        count = prev + 1;
    } else {
        count = prev + 2 * count;
    }
}
        }
        return count;
    }
}