class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb=new StringBuilder(s1);
        String s2=sb.reverse().toString();

        return s1.equals(s2);

    }
}