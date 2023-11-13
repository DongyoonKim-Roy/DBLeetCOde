class Solution {
    public int trap(int[] height) {
        int maxL = 0;
        int maxR = 0;
        int l = 0;
        int r = height.length - 1;
        int res = 0;
        while(l <= r){
            if(height[l] <= height[r]){
                if(maxL <= height[l])
                    maxL = height[l];
                else
                    res += maxL - height[l];
                
                l++;
            }//if
            else{
                if(maxR <= height[r])
                    maxR = height[r];
                else
                    res += maxR - height[r];
                r--;
            }//else
        } //while
        
        return res;
    }
}