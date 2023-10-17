class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        
        int res = -1;
        int freq = 0;
        int curr = 0;
        
        
        for(int n : nums){
            if(n % 2 == 1)
                continue;
            curr = numMap.getOrDefault(n, 0) + 1;
            numMap.put(n, curr);
            
            if(curr > freq || curr == freq && n < res){
                freq = curr;
                res = n;
            }
        } //for
        
        
        return res;
    }
}