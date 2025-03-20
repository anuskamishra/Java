package array2D;
import java.util.Scanner;
public class Transpose_Matrix {
	public static int[][] create2DArray(int rows, int cols) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        return arr;
    }
	 public static int[][] transposeMatrix(int[][] arr) {
	        int rows = arr.length;
	        int cols = arr[0].length;
	        int[][] transposed = new int[cols][rows]; 

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                transposed[j][i] = arr[i][j]; 
	            }
	        }
	        return transposed; 
	    }
	 public static void printMatrix(int[][] arr) {
	        for (int[] row : arr) {
	            for (int value : row) {
	                System.out.print(value + " ");
	            }
	            System.out.println();
	        }
	    }
	 public static void main(String[] args) {
	        int rows = 3, cols = 3; 
	        int[][] matrix = create2DArray(rows, cols);

	        System.out.println("Original Matrix:");
	        printMatrix(matrix); 

	        int[][] transposedMatrix = transposeMatrix(matrix); 

	        System.out.println("Transposed Matrix:");
	        printMatrix(transposedMatrix); 
	    }
}
