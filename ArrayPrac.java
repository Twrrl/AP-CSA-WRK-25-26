
import java.util.Arrays;


public class ArrayPrac{
    public static void main(String[] args) {
      int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
      int[][] matrix2 = {{2,4}, {6,8}};
      int[][] matrix3 ={{3, 1, 3}, {2, 3, 4}};

      System.out.println(sum2D(matrix));
      System.out.println(rowAverage(matrix2,1));
      System.out.println(countValue(matrix3,3));
      System.out.println(Arrays.deepToString(diff2d(matrix ,matrix3)));


  }

    public static int sum2D(int[][] matrix){
      int sum = 0;
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j++) {
                if (matrix1[j] % 2 == 0) {
                    sum += matrix1[j];
                }
            }
        }
      return sum;
    }

    public static double rowAverage(int[][] matrix, int row) {
      double average = 0.0;
      for(int i = 0; i < matrix[row].length; i++){
          average += matrix[row][i];

      }
      return average/matrix[row].length;
    }

    public static int countValue(int[][] matrix, int target){
      int count = 0;
      for(int i = 0; i < matrix.length; i++){
        for(int j = 0; j < matrix[i].length; j++){
            if(matrix[i][j] == target){
              count++;
            }
        }
      }
      return count;
    }

    public static int columnMaximum(int[][] Matrix, int col){
      int largest = Matrix[col][0];
          for(int i = 0; i < Matrix[col].length; i++){
            if(largest < Matrix[col][i]){
              largest = Matrix[col][i];
            }
          }
      return largest;
    }

    public static int[][] diff2d(int[][] matrix1, int[][] matrix2){
      int[][] result = new int[matrix1.length][matrix1[0].length];
      for(int i = 0; i < matrix1.length; i++){
          for(int j = 0; j < matrix1[i].length; j++){
            result[i][j] = matrix1[i][j] - matrix2[i][j];
          }
      } 
      return result;
    }
}