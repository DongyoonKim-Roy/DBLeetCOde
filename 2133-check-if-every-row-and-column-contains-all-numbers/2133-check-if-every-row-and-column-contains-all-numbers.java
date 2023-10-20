class Solution {
    public boolean checkValid(int[][] matrix) {
        //brute force
        int len = matrix.length;
        boolean[] flag = new boolean[len];
        
        for(int i = 0; i < matrix[0].length; i++){
            for(int j = 0; j < matrix[i].length; j++)
                flag[matrix[i][j] - 1] = true;
            
            for(int k = 0; k < len; k++){
                if(!flag[k])
                    return false;
                else
                    flag[k] = false;
            }
        }
        
        for(int i = 0; i < matrix[0].length; i++){
            for(int j = 0; j < matrix[i].length; j++)
                flag[matrix[j][i] - 1] = true;
            
            for(int k = 0; k < len; k++){
                if(!flag[k])
                    return false;
                else
                    flag[k] = false;
            }
        }
        return true;
    }
}