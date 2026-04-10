public class SkyView {
    private double[][] view;

    public SkyView(int numberOfRows, int numberOfCols, double[] scanned) {
        if (numberOfRows * numberOfCols < scanned.length) {
            throw new IllegalArgumentException("Scanned array does not fit view.");
        }

        view = new double[numberOfRows][numberOfCols];
        int index = 0;

        for (int r = 0; r < numberOfRows; r++) {
            if (r % 2 == 0) {
                for (int c = 0; c < numberOfCols; c++) {
                    view[r][c] = scanned[index++];
                }
            } else {
                for (int c = numberOfCols - 1; c >= 0; c--) {
                    view[r][c] = scanned[index++];
                }
            }
        }
    }

    public String toString() {
        String result = "";
        for (int r = 0; r < view.length; r++) {
            for (int c = 0; c < view[0].length; c++) {
                result += view[r][c] + " ";
            }
            result += "\n";
        }
        return result;
    }

    public boolean equals(SkyView other) {
        if (other == null
                || view.length != other.view.length
                || view[0].length != other.view[0].length) {
            return false;
        }
        for (int r = 0; r < view.length; r++) {
            for (int c = 0; c < view[0].length; c++) {
                if (view[r][c] != other.view[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        if (startRow < 0 || endRow >= view.length
                || startCol < 0 || endCol >= view[0].length
                || startRow > endRow || startCol > endCol) {
            throw new IllegalArgumentException("Invalid index range.");
        }

        double sum = 0;
        int count = 0;

        for (int r = startRow; r <= endRow; r++) {
            for (int c = startCol; c <= endCol; c++) {
                sum += view[r][c];
                count++;
            }
        }
        return sum / count;
    }

    public double[][] getView() {
        return view;
    }

    public void setView(double[][] view) {
        this.view = view;
    }
}