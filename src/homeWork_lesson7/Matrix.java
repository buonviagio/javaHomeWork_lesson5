package homeWork_lesson7;

public class Matrix {
    double[][] matrixArray;
    int rows;
    int cols;


    public Matrix(double[][] matrix) {
        this.matrixArray = matrix;
        this.rows = matrix.length;
        this.cols = matrix[0].length;
    }

    /*
     method
    shows array
     */
    public void show() {
        for (double[] a : matrixArray) {
            System.out.println();
            for (double b : a) {
                System.out.print(b + " ");
            }

        }
    }

    /*
    sum of matrix
     */
    public Matrix calc(Matrix matrix) {

            double[][] array = new double[rows][cols];

            for (int i = 0; i < matrixArray.length; i++) {
                for (int j = 0; j < matrixArray[0].length; j++) {
                    array[i][j] = matrix.matrixArray[i][j] + this.matrixArray[i][j];
                }
            }
            return new Matrix(array);
    }

    /*
    matrix multiplication by number
     */


        public Matrix multiplication ( double x){

        double[][] array = new double[rows][cols];
            for (int i = 0; i < this.matrixArray.length; i++) {
                for (int j = 0; j < this.matrixArray[0].length; j++) {
                    array[i][j] = this.matrixArray[i][j] * x;
                }
            }
        return new Matrix(array);
    }


    /*
    matrix multiplication
     */
    public Matrix multMatrix(Matrix matrix) {
        int m = this.matrixArray.length;
        int n = matrix.matrixArray[0].length;
        int o = matrix.matrixArray.length;
        double[][] res = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += this.matrixArray[i][k] * matrix.matrixArray[k][j];
                }
            }
        }
        return new Matrix(res);
    }
}


