class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings ,new Comparator<int[]>(){
            public int compare(int[]a , int[]b){
                return Integer.compare(a[0],b[0]);
            }    
        });
       
       
        int meet_days = 0;
        int start = meetings[0][0];
        int end = meetings[0][1];
        for(int i=1 ; i<meetings.length ; i++){
            if(meetings[i][0]<=end){
                end = Math.max(end , meetings[i][1]);
            }
            else{
                days = days - (end - start + 1);
                start = meetings[i][0];
                end = meetings[i][1];
            }
        }
        days = days - (end - start + 1);
        return days;
    }
}