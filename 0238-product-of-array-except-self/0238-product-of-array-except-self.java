class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*
            [2,2,3,4]
            [24, 24, 16, 12]
            48 / 2 = 24
            48 / 2 = 24
            48 / 3 = 16
            48 / 4 = 12
            
            [-1,1,0,-3,3]
            [0,0,9,0,0]
        */
        int len = nums.length;
        int[] res = new int[len];
        int temp = 1;
        
        for(int i = 0; i < len; i++){
            res[i] = temp;
            temp *= nums[i];
        }
        
        temp = 1; 
        
        for(int i = len - 1; i >= 0; i--){
            res[i] *= temp;
            temp *= nums[i];
        }
       
        return res;
    }
}