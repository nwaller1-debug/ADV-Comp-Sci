import java.util.Random;

public class MatrixFun {
    private int[][] matrix;

    public MatrixFun(int numberOfRows, int numberOfCols) {
        if (numberOfRows <= 0 || numberOfCols <= 0) {
            throw new IllegalArgumentException("Rows and columns must be positive.");
        }
        matrix = new int[numberOfRows][numberOfCols];
    }

    public MatrixFun(int[][] starterMatrix) {
        if (starterMatrix == null || starterMatrix.length == 0) {
            throw new IllegalArgumentException("Matrix cannot be null or empty.");
        }
        matrix = starterMatrix;

    }

    public MatrixFun() {
        matrix = new int[3][3];
        randomValues();
    }

    public void randomValues() {
        Random rand = new Random();
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = rand.nextInt(10);
            }
        }
    }

    public String toString() {
        String result = "";
        int rowLength = matrix[0].length * 2;
        result += "=".repeat(rowLength) + "\n";
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                result += matrix[r][c] + " ";
            }
            result += "\n";
        }
        result += "=".repeat(rowLength) + "\n";
        return result;
    }

    public boolean equals(MatrixFun other) {
        if (other == null) {
            return false;
        }
        return equals(other.matrix);
    }

    public boolean equals(int[][] other) {
        if (other == null || other.length != matrix.length) {
            return false;
        }
        for (int r = 0; r < matrix.length; r++) {
            if (other[r].length != matrix[r].length) {
                return false;
            }
            for (int c = 0; c < matrix.length; c++) {
                if (other[r][c] != matrix[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void replaceAll(int oldValue, int newValue) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == oldValue) {
                    matrix[r][c] = newValue;
                }
            }
        }

    }

    public void swapRow(int rowA, int rowB) {
        if (rowA < 0 || rowB < 0 || rowA >= matrix.length || rowB >= matrix.length) {
            throw new IllegalArgumentException("Row index out of bounds.");
        }
        int[] x = matrix[rowA];
        matrix[rowA] = matrix[rowB];
        matrix[rowB] = x;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

}
