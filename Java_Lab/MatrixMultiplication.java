public class MatrixMultiplication {

    int[][] matrix;
    int rows, cols;

    MatrixMultiplication(int[][] matrix, int rows, int cols) {
        this.matrix = matrix;
        this.rows = rows;
        this.cols = cols;
    }

    MatrixMultiplication multiply(MatrixMultiplication other) {
        if (this.cols != other.rows) {
            System.out.println("Matrix multiplication not possible.");
            return null;
        }

        int[][] result = new int[this.rows][other.cols];

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result[i][j] += this.matrix[i][k] * other.matrix[k][j];
                }
            }
        }

        return new MatrixMultiplication(result, this.rows, other.cols);
    }

    void display() {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {
            {1, 2},
            {3, 4}
        };

        int[][] b = {
            {5, 6},
            {7, 8}
        };

        MatrixMultiplication m1 = new MatrixMultiplication(a, 2, 2);
        MatrixMultiplication m2 = new MatrixMultiplication(b, 2, 2);

        MatrixMultiplication result = m1.multiply(m2);

        if (result != null) {
            System.out.println("Result of Matrix Multiplication:");
            result.display();
        }
    }
}
