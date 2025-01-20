class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int l = m*n;

        int[] rowIndex = new int[l+1];
        int[] colIndex = new int[l+1];

        for(int i=0 ;i<m ;i++){
            for(int j=0 ;j<n ;j++){
                rowIndex[mat[i][j]] = i;
                colIndex[mat[i][j]] = j;
            }
        }

        int rowFre[] = new int[m];
        int colFre[] = new int[n];

        for(int i=0 ;i<l ;i++){
            int row = rowIndex[arr[i]];
            int col = colIndex[arr[i]];
            rowFre[row]++;
            colFre[col]++;

            if(rowFre[row] == n || colFre[col]==m) return i;
         }

        return -1;
    }
}