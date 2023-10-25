class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];
        
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 1) + 1);
        }
        
        
        for(int i = 0; i < k; i++){
            int temp = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
            map.remove(temp);
            res[i] = temp;
            
        }
        
        return res;
    }
}