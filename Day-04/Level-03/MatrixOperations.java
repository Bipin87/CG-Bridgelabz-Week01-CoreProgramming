import java.util.Random;

public class MatrixOperations {

    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Generate random numbers between 0 and 9
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition.");
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for subtraction.");
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            throw new IllegalArgumentException("Number of columns in matrix1 must be equal to number of rows in matrix2.");
        }

        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    public static int determinant2x2(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix must be 2x2 for determinant calculation.");
        }

        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static int determinant3x3(int[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Matrix must be 3x3 for determinant calculation.");
        }

        int det = matrix[0][0] * determinant2x2(new int[][]{{matrix[1][1], matrix[1][2]}, {matrix[2][1], matrix[2][2]}}) -
                matrix[0][1] * determinant2x2(new int[][]{{matrix[1][0], matrix[1][2]}, {matrix[2][0], matrix[2][2]}}) +
                matrix[0][2] * determinant2x2(new int[][]{{matrix[1][0], matrix[1][1]}, {matrix[2][0], matrix[2][1]}});

        return det;
    }

    // Methods for finding the inverse of matrices (not implemented in this example)
    // ...

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows1 = 2, cols1 = 2;
        int rows2 = 3, cols2 = 3;

        int[][] matrix1 = createRandomMatrix(rows1, cols1);
        int[][] matrix2 = createRandomMatrix(rows2, cols2);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        // Add matrices (if possible)
        try {
            int[][] sumMatrix = addMatrices(matrix1, matrix2);
            System.out.println("Sum of Matrices:");
            displayMatrix(sumMatrix);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Subtract matrices (if possible)
        try {
            int[][] diffMatrix = subtractMatrices(matrix1, matrix2);
            System.out.println("Difference of Matrices:");
            displayMatrix(diffMatrix);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Multiply matrices (if possible)
        try {
            int[][] productMatrix = multiplyMatrices(matrix1, matrix2);
            System.out.println("Product of Matrices:");
            displayMatrix(productMatrix);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Transpose of matrix1
        int[][] transpose1 = transposeMatrix(matrix1);
        System.out.println("Transpose of Matrix 1:");
        displayMatrix(transpose1);

        // Transpose of matrix2
        int[][] transpose2 = transposeMatrix(matrix2);
        System.out.println("Transpose of Matrix 2:");
        displayMatrix(transpose2);

        // Determine determinant of 2x2 submatrices (if applicable)
        if (matrix1[0].length == 2 && matrix1.length == 2) {
            System.out.println("Determinant of Matrix 1 (2x2): " + determinant2x2(matrix1));
        }
        if (matrix2[0].length == 2 && matrix2.length == 2) {
            System.out.println("Determinant of Matrix 2 (2x2): " + determinant2x2(matrix2));
        }

        // Determine determinant of 3x3 submatrices (if applicable)
        if (matrix1[0].length == 3 && matrix1.length == 3) {
            System.out.println("Determinant of Matrix 1 (3x3): " + determinant3x3(matrix1));
        }
        if (matrix2[0].length == 3 && matrix2.length == 3) {
            System.out.println("Determinant of Matrix 2 (3x3): " + determinant3x3(matrix2));
        }

        // ... (Add methods for finding inverse of matrices and display results)
    }
}