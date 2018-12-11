package homeWork_lesson7;

public class Matrix {
    double[][] matrixArray = new double[4][4];

    /*
    Constructor
     */
    public Matrix(double[][] matrix) {
        this.matrixArray = matrix;
    }

    /* method
    shows array
     */
    public void show(double x[][]) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.print(x[i][j] + "; ");
            }
            System.out.println();
        }
    }

    /*
    matrix + matrix
     */
    public void calc(double array[][], double array1[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = array[i][j] + array1[i][j];
            }
        }
    }

    /*
    matrix multiplication by number
     */
    public void multiplication(double[][] array, double x) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = array[i][j] * x;
            }
        }
    }

    /*
    matrix multiplicationtemp
     */
    public void multMatrix(double[][] a, double[][] b) {
        int m = a.length;
        int n = b[0].length;
        int o = b.length;
        double[][] res = new double[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + "; ");
            }
            System.out.println();
        }
    }
}


