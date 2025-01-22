class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;

        int[][] height = new int[m][n];
        
        for(int i=0; i<m ;i++){
            Arrays.fill(height[i] , -1);
        }

        Queue<int[]>q = new ArrayDeque<>();

        for(int i=0; i<m ;i++){
            for(int j=0;j<n;j++){
                if (isWater[i][j] == 1) {
                    height[i][j] = 0;
                    q.offer(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty()){
            int []curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            int h = height[r][c];

            int neighs[][] = new int[][]{new int[]{r-1,c},new int[]{r+1 ,c} , new int[]{r , c+1} ,new int[]{r , c-1} };
            for(int[] neigh : neighs){
               int nr = neigh[0];
               int nc = neigh[1]; 

               if(nr<0 || nc <0 || nr==m || nc==n || height[nr][nc]!=-1){
                continue;
               }
               q.offer(new int[]{nr ,nc});
               height[nr][nc] = h+1;
            }
        }

        return height;
    }
}