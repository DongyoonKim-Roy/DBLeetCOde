class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<String>();
        int l = 0;
        res.add(words[l]);
        
        for(int i = 1; i < words.length; i++){
            char[] t1 = words[l].toCharArray();
            char[] t2 = words[i].toCharArray();
            Arrays.sort(t1);
            Arrays.sort(t2);
            
            if(!Arrays.equals(t1, t2)){
                res.add(words[i]);
                l = i;
            }
        }
        
        return res;
    }
}