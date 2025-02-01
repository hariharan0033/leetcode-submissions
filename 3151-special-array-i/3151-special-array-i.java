class Solution {
    public boolean isArraySpecial(int[] nums) {
        int last = nums[0]%2;
        for(int i=1 ;i<nums.length ;i++){
            int curr = nums[i]%2;
            if(last==curr) return false;
            last = curr;
        }
        return true;
    }
}