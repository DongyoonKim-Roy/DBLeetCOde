class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<String>();
        String prev = "";
        
        for(int i = 0; i < words.length; i++){
            char[] t = words[i].toCharArray();
            Arrays.sort(t);
            String curr = String.valueOf(t);
            
            if(!curr.equals(prev)){
                res.add(words[i]);
                prev = curr;
            }
        }
        
        return res;
    }
}