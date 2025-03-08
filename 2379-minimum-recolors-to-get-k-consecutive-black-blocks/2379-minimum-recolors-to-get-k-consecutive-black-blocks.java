class Solution {
    public int minimumRecolors(String blocks, int k) {
        int reColor = 0;
        int res = k;
        int l = 0;
        for(int r=0 ;r<blocks.length() ;r++){
            if(blocks.charAt(r)=='W'){
                reColor++;
            }
            if(r-l+1 > k){
                if(blocks.charAt(l)=='W'){
                    reColor--;
                }
                l++;
            }
            if(r-l+1 == k) res = Math.min(res , reColor);
            
        }
        return res;
    }
}