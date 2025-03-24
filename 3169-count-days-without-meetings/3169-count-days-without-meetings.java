class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings , (a ,b) -> Integer.compare(a[0] , b[0]));
        int prevEnd = 0;
        for(int[] meeting : meetings){
            int start = Math.max(meeting[0] , prevEnd +1);
            int end = meeting[1];
            days -= Math.max((end - start + 1),0);
            prevEnd = Math.max(prevEnd , end);
        }
        return days;
    }
}