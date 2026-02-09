public class MatrixFun {
    private int[][] matrix;

    public MatrixFun(int numberOfRows, int numberOfColloms) {
        matrix = new int[numberOfRows][numberOfColloms];
    }

    public MatrixFun(int[][] starterMatrix) {
        matrix = starterMatrix;
    }

    public MatrixFun() {
        matrix = new int[3][3];
    }

    public String toString() {
        String x = "";
        x += "=".repeat(matrix.length);
        String y = "";
        for (int r = 0; r < matrix.length; r++) {
            y += "\n";
            for (int c = 0; c < matrix.length; c++) {
                y += matrix[r][c];
            }
        }
        return x + y + "\n" + x;

    }

    public boolean equals(MatrixFun other) {
        if (matrix.toString().equals(other.matrix.toString())) {
            return true;
        } else {
            return false;
        }

    }

    public boolean equals(int[][] other) {
        for (int r = 0; r < matrix.length; r++) {
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
            for (int c = 0; c < matrix.length; c++) {
                if (matrix[r][c] == oldValue) {
                    matrix[r][c] = newValue;
                }
            }
        }

    }

    public void swapRow(int rowA, int rowB) {
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
