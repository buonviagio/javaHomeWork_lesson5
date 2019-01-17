package homeWork_lesson14.task7;



public class NewMatrix<T> {
    T[][] matrixArray;
    Integer rows;
    Integer cols;
    T tmp1;
    T tmp2;
    T result;


    public NewMatrix(T[][] matrix) {
        this.matrixArray = matrix;
        this.rows = matrix.length;
        this.cols = matrix[0].length;
    }

    /*
     method
    shows array
     */
    public void show() {
        for (T[] a : matrixArray) {
            System.out.println();
            for (T b : a) {
                System.out.print(b + " ");
            }

        }
    }

    /*
    sum of matrix
     */
public NewMatrix calc(NewMatrix<T> matrix) {

    NewMatrix<?>[][] array = new NewMatrix<?> [rows][cols];

    for (int i = 0; i < matrixArray.length; i++) {
        for (int j = 0; j < matrixArray[0].length; j++) {
            array[i][j] = matrix.matrixArray[i][j] + this.matrixArray[i][j];
        }
    }
    return new NewMatrix(array);
}

   // /*
   // matrix multiplication by number
   //  */
//
//
   // public NewMatrix multiplication ( double x){
//
   //     double[][] array = new double[rows][cols];
   //     for (int i = 0; i < this.matrixArray.length; i++) {
   //         for (int j = 0; j < this.matrixArray[0].length; j++) {
   //             array[i][j] = this.matrixArray[i][j] * x;
   //         }
   //     }
   //     return new NewMatrix(array);
   // }
//
//
   // /*
   // matrix multiplication
   //  */
   // public NewMatrix multMatrix(NewMatrix matrix) {
   //     int m = this.matrixArray.length;
   //     int n = matrix.matrixArray[0].length;
   //     int o = matrix.matrixArray.length;
   //     double[][] res = new double[m][n];
   //     for (int i = 0; i < m; i++) {
   //         for (int j = 0; j < n; j++) {
   //             for (int k = 0; k < o; k++) {
   //                 res[i][j] += this.matrixArray[i][k] * matrix.matrixArray[k][j];
   //             }
   //         }
   //     }
   //     return new NewMatrix(res);
   // }
}
