class Solution {
    public boolean canPartition(int[] nums) {
        int target = 0;
        for(int num : nums){
            target += num;
        }
        if(target%2 != 0 ) return false;
        target/=2;

        Set<Integer>sums = new HashSet<>();
        sums.add(0);
        for(int num : nums){
            if(num == target) return true;
            HashSet<Integer>temp = new HashSet<>();
            for(int sum : sums ){
                int curr = sum + num;
                if(curr == target) return true;
                temp.add(curr);
            }
            sums.addAll(temp);
        }
        return false;
    }
}