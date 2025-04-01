class Solution {
    public long mostPoints(int[][] questions) {
        long[] cache = new long[questions.length];
        return backtrack(questions , cache , 0);
    }
    private long backtrack(int[][] questions , long[] cache ,int i){
        if(i >= questions.length){
            return 0;
        }
        if(cache[i]!=0) return cache[i];
        int points = questions[i][0];
        int brainpower = questions[i][1];
        cache[i] =  Math.max( 
            backtrack(questions , cache , i+1),
            points + backtrack(questions , cache , i+1+brainpower)
        );
        return cache[i];
    }
}