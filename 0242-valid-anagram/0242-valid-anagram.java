class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n!=m) return false;

        HashMap<Character , Integer>freq = new HashMap<>();
        for(int i=0 ;i<n ;i++){
            freq.put(s.charAt(i) ,freq.getOrDefault(s.charAt(i),0)+1);
            freq.put(t.charAt(i) ,freq.getOrDefault(t.charAt(i),0)-1);
        }
        for(char c : freq.keySet()){
            if(freq.get(c)!=0) return false;
        }
        return true;
    }
}