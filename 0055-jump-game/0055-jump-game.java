class Solution {
    public boolean canJump(int[] nums) {
        int sum = 0;
        int len = nums.length;
        
        for(int i = 0; i < len && i <= sum; i++){
            sum = Math.max(sum, i + nums[i]);
            if (sum >= len - 1) 
                return true;
            
        }
        
        return false;
    }
}