import java.util.Arrays;
public class TransposeOfMatrix {
    public static int[][] transposeMatrix(int[][] array){
        int row = array.length;
        int coln = array[0].length;
        int[][] transposeMatrix = new int[coln][row];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < coln; j++){
                transposeMatrix[j][i] = array[i][j];
            }
        }
        return transposeMatrix;
    }
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("The transpose of given matrix " + Arrays.deepToString(array) + " is " + Arrays.deepToString(transposeMatrix(array)));
    }
}
