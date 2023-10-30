class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        //[-4 -1 -1 0 1 2]
        int l = 0;
        int r = 0;
        int sum = 0;
        
        for(int i = 0; i < nums.length - 2; i++){
            int temp = nums[i];
            l = i + 1;
            r = nums.length - 1;
            
            while(l < r){
                sum = temp + nums[l] + nums[r];
                
                if(sum > 0)
                    r--;
                else if(sum < 0)
                    l++;
                else if(sum == 0){
                    res.add(Arrays.asList(temp, nums[l], nums[r]));
                    l++;
                    r--;
                }
            }
        }
        return new ArrayList<>(res);
    }
}