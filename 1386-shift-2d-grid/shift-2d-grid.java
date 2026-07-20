class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;

        int total=n*m;
        k=k%total;
        List<List<Integer>>res=new ArrayList<>();

        for(int i=0;i<n;i++){
            List<Integer>list=new ArrayList<>();
            for(int j=0;j<m;j++){
                list.add(0);
            }
            res.add(list);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int index=i*m + j;

                int newIndex=(index+k)%total;
                int newR=newIndex/m;
                int newC=newIndex%m;

                res.get(newR).set(newC,grid[i][j]);
            }
        }
        return res;
    }
}