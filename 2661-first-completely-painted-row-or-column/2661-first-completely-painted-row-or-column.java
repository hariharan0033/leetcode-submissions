class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int l = m*n;

        HashMap<Integer ,int[]>position = new HashMap<>();
        for(int i=0 ;i<m ;i++){
            for(int j=0 ;j<n ;j++){
                position.put(mat[i][j] , new int[]{i,j});
            }
        }

        int rowFre[] = new int[m];
        int colFre[] = new int[n];

        for(int i=0 ;i<l ;i++){
            int[] pos = position.get(arr[i]);
            int row = pos[0];
            int col = pos[1];
            rowFre[row]++;
            colFre[col]++;

            if(rowFre[row] == n || colFre[col]==m) return i;
         }

        return -1;
    }
}