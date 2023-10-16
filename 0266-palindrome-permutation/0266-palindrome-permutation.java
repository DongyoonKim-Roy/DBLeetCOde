class Solution {
    public boolean canPermutePalindrome(String s) {
        int len = s.length();
        Set perSet = new HashSet<Character>();
        
        for(int i = 0; i < len; i++){
            if(!perSet.add(s.charAt(i)))
                perSet.remove(s.charAt(i));
        }
        return perSet.size() <= 1;
    }
}