class Solution {
    public long maximumTripletValue(int[] nums) {
        long res = 0;
        int left = nums[0];
        int n = nums.length;
        int[] kArr = new int[n];
        kArr[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            kArr[i] = Math.max(nums[i] , kArr[i+1]);
        }

        for(int j=1;j<n-1;j++){
            if(left < nums[j]){
                left = nums[j];
                continue;
            }
            res = Math.max(res , (long)(left - nums[j])*kArr[j+1]);
        }
        return res;
    }
}