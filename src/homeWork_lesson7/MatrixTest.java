package homeWork_lesson7;

public class MatrixTest {
    public static void main(String[] args) {
        Matrix objMatrix = new Matrix(
                new double[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {10, 11, 12, 13},
                        {20, 21, 22, 23}
                }
        );

        double[][] arrayMain = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {10, 11, 12, 13},
                {20, 21, 22, 23}
        };

        objMatrix.calc(objMatrix.matrixArray, arrayMain);
        objMatrix.show(objMatrix.matrixArray);
        System.out.println();

        double factor = 3.0;
        objMatrix.multiplication(objMatrix.matrixArray, factor);
        objMatrix.show(objMatrix.matrixArray);
        System.out.println();


        double[][] arrayMultiplication = {
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4},
                {5, 5, 5, 5}
        };

        objMatrix.multMatrix(objMatrix.matrixArray, arrayMultiplication);
        System.out.println();
    }
}
