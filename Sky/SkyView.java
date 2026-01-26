public class SkyView {
    private double [][] view;



    public SkyView(int numberOfRows, int numberOfCols, double [] scanned) {
        double [][] matrix = new double[numberOfRows][numberOfCols];
        int z = 0;
        int x = 0;
        for (int i = 0; i < numberOfRows; i++) {
            if ((x % 2) == 0) {
                for (int y = 0; y < numberOfRows; y++) {
                    matrix[i][y] = scanned[z];
                    z++;
                }
            } else {
                for (int y = numberOfRows - 1; y > 0; y--) {
                    matrix[i][y] = scanned[z];
                    z++;
                    }
            
                }
        }
        view = matrix;
    }
    
    public String toString() {
        String z = "";
        for (int i = 0; i < view.length; i++) {
            for (int y = 0; y < view[0].length; y++) {
                z += view[i][y];
            }
            z += "\n";
        }
        return z;
    }

    public boolean equals(SkyView other) {
        if (this.view.length != other.view.length || 
            this.view[0].length != other.view[0].length) {
            return false;
        }
        for (int i = 0; i < view.length; i++) {
            for (int y = 0; y < view[0].length; y++) {
                 if (this.view[i][y] != other.view[i][y]) {
                    return false;
                 }
            }
        }
        return true;
    }
    
    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        double z = 0;
        double total = 0;
        for (int i = startRow; i < endRow; i++) {
            for (int y = startCol; y < endCol; y++) {
                z ++;
                total += view[i][y];
            }
        }
        return total/z;
    }
}