package homeWork_lesson7;

public class MatrixTest {
    public static void main(String[] args) {
        Matrix objMatrix = new Matrix(
                new double[][]{
                        {1, 2, 3, 4,},
                        {5, 6, 7, 8},
                        {10, 11, 12, 13},
                        {20, 21, 22, 23}
                }
        );

        double[][] arrayMain = {
                {1, 2, 3, 4, 6,8},
                {5, 6, 7, 8},
                {10, 11, 12, 13},
                {20, 21, 22, 23}
        };

        Matrix matrixResult = objMatrix.calc(new Matrix(arrayMain));
        matrixResult.show();
        System.out.println();

        Matrix matrixResultMult = objMatrix.multiplication(5);
        matrixResultMult.show();
        System.out.println();

        double[][] arrayMultiplication = {
                {2, 2, 2},
                {3, 3, 3},
                {4, 4, 4},
                {5, 5, 5}
        };

        Matrix matrixMultiplication = objMatrix.multMatrix(new Matrix(arrayMultiplication));
        matrixMultiplication.show();
    }
}
