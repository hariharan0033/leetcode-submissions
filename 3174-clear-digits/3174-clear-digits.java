class Solution {
    public String clearDigits(String s) {
        Stack<Character>stk = new Stack<>();
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                stk.pop();
            }
            else{
                stk.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.insert(0 , stk.pop());
        }
        return sb.toString();
    }
}