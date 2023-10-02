class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for(int n = 0; n < nums.length; n++){
            if(nums[n] != val){
                nums[index] = nums[n];
                index++;
            }
            
        }
        return index;
    }
}