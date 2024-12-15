package entrevistas;

public class MatrixFromArray {
    // 2
    // [1,2,3,4,5] -> [[1,2],[3,4],[5]]

    // 3
    // [1,2,3,4,5] -> [[1,2,3],[4,5]]

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        var matrix = matrixFromArray(3, array);

        System.out.print("[");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(",");
            }
            System.out.print("]");
        }
        System.out.print("]");
    }

    public static int[][] matrixFromArray(int size, int[] array) {
        int groups = (array.length / size) + ((array.length % size) > 0 ? 1 : 0);
        int[][] matrix = new int[groups][size];
        for (int i = 0; i < array.length; i++) {
            matrix[i / size][i % size] = array[i];
        }
        return matrix;
    }
}
