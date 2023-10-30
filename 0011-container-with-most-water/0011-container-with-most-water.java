class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int l = 0;
        int r = height.length - 1;
        int w = 0;
        
        while(l < r){
            w = r - l;
            res = Math.max(res, Math.min(height[l], height[r]) * w);
            
            if(height[l] <= height[r])
                l++;
            else if(height[l] >= height[r])
                r--;
        }
        return res;
    }
}