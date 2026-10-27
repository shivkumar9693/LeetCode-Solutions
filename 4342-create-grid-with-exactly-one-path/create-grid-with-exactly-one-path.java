class Solution {
    public String[] createGrid(int m, int n) {
        String[] res = new String[m];
        
        Arrays.fill(res, 0, m - 1, "." + "#".repeat(n - 1));
        res[m - 1] = ".".repeat(n);
        
        return res;
    }
}