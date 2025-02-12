class Solution {
    public int maximumSum(int[] nums) {
        int sums[][] = new int[82][2];
        
        for(int num  : nums){
            int sod = sumOfDigits(num);
            if(sums[sod][0] < num){
                sums[sod][1] = sums[sod][0];
                sums[sod][0] = num;
            }
            else{
                if(sums[sod][1] < num){
                    sums[sod][1] = num;
                }
            }
        }

        int res = -1;
        for(int sum[] : sums){
           if(sum[0] > 0 && sum[1] > 0){
             int curr = sum[0] + sum[1];
             res = Math.max(res , curr);
           }
        }
        return res;
    }
    private int sumOfDigits(int num){
        int sod = 0;
        while(num>0){
            sod += num%10;
            num = num/10;
        }
        return sod;
    }
}