class Solution {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        long []firstRow = new long[n];
        long []secondRow = new long[n];
        firstRow[0] = grid[0][0];
        secondRow[0] = grid[1][0];
        for(int i=1 ;i<n ;i++){
            firstRow[i]=firstRow[i-1]+grid[0][i];
            secondRow[i]=secondRow[i-1]+grid[1][i];
        }
        
        long res = firstRow[n-1]-firstRow[0];
        for(int i=1 ;i<n;i++){
                res = Math.min(res , Math.max(firstRow[n-1]-firstRow[i],secondRow[i-1]));
        }
        return res;
    }
}