package UniquePaths;

public class UniquePathsSolution {
    public int uniquePaths(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i == 0 || j == 0){
                    matrix[i][j] = 1;
                    continue;
                }
                int a = i - 1 != 0 ? matrix[i - 1][j] : 1;
                int b = j - 1 != 0 ? matrix[i][j - 1] : 1;
                matrix[i][j] = a + b;
            }
        }
        return matrix[m - 1][n - 1];
    }

    public static void main(String[] args) {
        UniquePathsSolution solution = new UniquePathsSolution();
        System.out.println(solution.uniquePaths(3, 7));
    }
}
