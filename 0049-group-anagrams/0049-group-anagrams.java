class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> resMap = new HashMap<String, List<String>>();
        
        for(int i = 0; i < strs.length; i++){
            char[] t = strs[i].toCharArray();
            Arrays.sort(t);
            String key = String.valueOf(t);
            
            if(!resMap.containsKey(key))
                resMap.put(key, new ArrayList());
            resMap.get(key).add(strs[i]);
                
        }
        return new ArrayList<>(resMap.values());
    }
}