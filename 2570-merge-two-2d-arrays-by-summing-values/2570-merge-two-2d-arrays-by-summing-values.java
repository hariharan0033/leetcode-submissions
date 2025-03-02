class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer , Integer>sum = new HashMap<>();

        for(int[] num : nums1){
            sum.put(num[0] ,num[1] + sum.getOrDefault(num[0] , 0));
        }
        for(int[] num : nums2){
            sum.put(num[0] ,num[1] + sum.getOrDefault(num[0] , 0));
        }

        int n = sum.size();
        int[][] res = new int[n][2];
        int idx = 0;
        for(int id : sum.keySet()){
            res[idx][0] = id;
            res[idx++][1] = sum.get(id);
        }

        Arrays.sort(res , (a,b) -> Integer.compare(a[0] , b[0]));
        return res;
    }
}