class Solution {
    public boolean checkPowersOfThree(int n) {
        return backtrack(0, 0 , n);
    }
    public boolean backtrack(int i , int curr , int n){
        if(curr == n){
            return true;
        }
        if(curr > n || Math.pow(3 , i) > n){
            return false;
        }
        if(backtrack(i+1 , curr + (int)Math.pow(3 , i) , n)){
            return true;
        }
        return backtrack(i+1 , curr , n);
    }
}