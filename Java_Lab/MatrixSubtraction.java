public class MatrixSubtraction {

    int[][] matrix;
    int rows, cols;

    MatrixSubtraction(int[][] matrix, int rows, int cols) {
        this.matrix = matrix;
        this.rows = rows;
        this.cols = cols;
    }

    MatrixSubtraction subtract(MatrixSubtraction other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            System.out.println("Matrix subtraction not possible.");
            return null;
        }

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = this.matrix[i][j] - other.matrix[i][j];
            }
        }

        return new MatrixSubtraction(result, rows, cols);
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
            {8, 6},
            {4, 2}
        };

        int[][] b = {
            {3, 1},
            {2, 5}
        };

        MatrixSubtraction m1 = new MatrixSubtraction(a, 2, 2);
        MatrixSubtraction m2 = new MatrixSubtraction(b, 2, 2);

        MatrixSubtraction result = m1.subtract(m2);

        if (result != null) {
            System.out.println("Result of Matrix Subtraction:");
            result.display();
        }
    }
}
