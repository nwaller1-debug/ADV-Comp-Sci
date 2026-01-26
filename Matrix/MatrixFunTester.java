public class MatrixFunTester {

    public static void main(String[] args) {
        int[] x = { 1, 2, 3 };
        int[] y = { 4, 5, 6 };
        int[] z = { 7, 8, 9 };
        int[][] neo = { x, y, z };
        int[][] neo1 = new int[3][3];
        MatrixFun mat3 = new MatrixFun(neo);
        MatrixFun mat = new MatrixFun();
        MatrixFun mat2 = new MatrixFun();
        MatrixFun mat1 = new MatrixFun(3, 3);
        System.out.println(mat.toString());
        System.out.println(mat1.toString());
        System.out.println(mat.equals(mat2));
        System.out.println(mat.equals(neo));
    }

}
