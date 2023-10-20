class Solution {
    public boolean checkValid(int[][] matrix) {
        //brute force
        int len = matrix.length;
        
        for(int i = 0; i < matrix[0].length; i++){
            HashSet<Integer> cols = new HashSet<Integer>();
            HashSet<Integer> rows = new HashSet<Integer>();
            
            for(int j = 0; j < matrix[i].length; j++){
                cols.add(matrix[j][i]);
                rows.add(matrix[i][j]);
            }
            
            if(cols.size() != len || rows.size() != len){
                return false;
            }
        }
        return true;
    }
}