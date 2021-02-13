package SearchA2DMatrix;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean result = false;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                if (matrix[i][j] == target){
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
