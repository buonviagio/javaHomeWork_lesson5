package homeWork_lesson14.task7;


public class NewMatrixDemo {
    public static void main(String[] args) {
        NewMatrix<Double> objMatrix = new NewMatrix<>(
                new Double[][]{
                        {1.0, 2.0, 3.0, 4.0},
                        {5.0, 6.0, 7.0, 8.0},
                        {10.0, 11.0, 12.0, 13.0},
                        {20.0, 21.0, 22.0, 23.0}
                }
        );

        objMatrix.show();
        System.out.println();
        Double[][] arrayMain = {
                {1.0, 2.0, 3.0, 4.0},
                {5.0, 6.0, 7.0, 8.0},
                {10.0, 11.0, 12.0, 13.0},
                {20.0, 21.0, 22.0, 23.0}
        };

        NewMatrix matrixResult = objMatrix.calc(new NewMatrix<>(arrayMain));
        matrixResult.show();
        System.out.println();

        NewMatrix matrixResultMult = objMatrix.multiplication(5.0);
        matrixResultMult.show();
        System.out.println();

        Double[][] arrayMultiplication = {
                {2.0, 2.0, 2.0, 2.0},
                {3.0, 3.0, 3.0, 3.0},
                {4.0, 4.0, 4.0, 4.0},
                {5.0, 5.0, 5.0, 5.0}
        };

        NewMatrix matrixMultiplication = objMatrix.multMatrix(new NewMatrix<>(arrayMultiplication));
        matrixMultiplication.show();
    }
}
