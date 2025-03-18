class Solution {
    public int longestNiceSubarray(int[] nums) {
        int res = 0;
        int l = 0;
        int curr = 0;
        for(int r = 0 ;r < nums.length ;r++){
            if((curr & nums[r]) ==0){
                System.out.println(curr & nums[r]);
                res = Math.max(res , r-l+1);
                curr |= nums[r];
            }
            else{
                while(l < nums.length && (curr & nums[r]) != 0){
                    curr^=nums[l];
                    l++;
                }
                curr |= nums[r];
            }
        }
        return res;
    }
}