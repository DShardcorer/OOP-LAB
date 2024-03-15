package ex6;

public class MatrixAddition {
    public static void main(String[] args) {
        // Constant matrices
        int[][] matrix1 = {{1, 6, 1}, {4, 5, 26}, {7, 8, 88}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        int[][] sumMatrix = new int[matrix1.length][matrix1[0].length];
        addMatrices(matrix1, matrix2, sumMatrix);
        System.out.println("Sum of the matrices:");
        displayMatrix(sumMatrix);
    }
    public static void addMatrices(int[][] matrix1, int[][] matrix2, int[][] resultMatrix) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
