class Solution {
    public int countBinarySubstrings(String s) {
        //count binary substrings that have the same number of 0's and 1's.
        int res = 0;
        int currLen = 1;
        int prevLen = 0;
        
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i-1) == s.charAt(i))
                currLen++;
            else{
                prevLen = currLen;
                currLen = 1;
            }
            
            if(prevLen >= currLen)
                res++;
        }
        
        return res;
    }
}