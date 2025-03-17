class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer , Integer>freq = new HashMap<>();
        for(int num : nums){
            freq.put(num , freq.getOrDefault(num , 0)+1);
        }
        for(int num : freq.keySet()){
            if(freq.get(num)%2 != 0) return false;
        }
        return  true;
    }
}