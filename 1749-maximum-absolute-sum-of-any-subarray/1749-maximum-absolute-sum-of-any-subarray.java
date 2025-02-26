class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int res = Math.abs(nums[0]);
        int currMax = nums[0];
        int currMin = nums[0];

        for(int i=1 ;i<nums.length ;i++){
            currMax = Math.max(nums[i] , currMax + nums[i]);
            currMin = Math.min(nums[i] , currMin + nums[i]);
            res = Math.max(res , Math.max(currMax , Math.abs(currMin)));
        }
        return res;
    }
}