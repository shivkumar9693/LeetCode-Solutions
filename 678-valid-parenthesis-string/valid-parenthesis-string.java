class Solution {
    public boolean checkValidString(String s) {
        int minOpen = 0;  // Minimum possible open parentheses
        int maxOpen = 0;  // Maximum possible open parentheses
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                minOpen++;
                maxOpen++;
            } else if (c == ')') {
                minOpen--;
                maxOpen--;
            } else { // c == '*'
                // Star can be '(', ')', or empty
                minOpen--;  // Treat as ')'
                maxOpen++;  // Treat as '('
            }
            
            // If maxOpen < 0, we have more ')' than total possible '('
            if (maxOpen < 0) return false;
            
            // MinOpen cannot be negative (clamp to 0)
            minOpen = Math.max(minOpen, 0);
        }
        
        // Valid if minOpen == 0 (at least one way to make all balanced)
        return minOpen == 0;
    }
}