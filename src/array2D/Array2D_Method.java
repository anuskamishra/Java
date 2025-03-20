package array2D;
import java.util.Scanner;
public class Array2D_Method {
//create a method for creating 2d array
	//return type of 2d array
	//use scanner
	//another method accept the 2d array and find the greatest element 
	//in the 2D array
	public static int[][] Input2DArray(int rows, int cols) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        return arr;
	}
	public static int findGreatestElement(int[][] arr) {
        int max = arr[0][0]; 
        for (int[] row : arr) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max; 
    }

	
	public static void main(String[] args) {
		 int rows = 3, cols = 3; 
	        int[][] matrix = Input2DArray(rows, cols); 
	        for (int[] row : matrix) {
	            for (int value : row) {
	                System.out.print(value + " ");
	            }
	            System.out.println();
	        }
	        int maxElement = findGreatestElement(matrix);
	        System.out.println("The greatest element in the array is " + maxElement);
	        
	}
	
}
