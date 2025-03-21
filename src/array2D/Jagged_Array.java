package array2D;
import java.util.Scanner;
public class Jagged_Array {
	 public static int[][] createJaggedArray(int rows) {
	        Scanner scan = new Scanner(System.in);
	        int[][] jaggedArr = new int[rows][];
	        for (int i = 0; i < rows; i++) {
	          
	            int cols = scan.nextInt(); 
	            jaggedArr[i] = new int[cols];

	            for (int j = 0; j < cols; j++) {
	                jaggedArr[i][j] = scan.nextInt();
	            }
	        }
	        return jaggedArr; 
	   }
	 public static void printJaggedArray(int[][] arr) {
	        System.out.println("Jagged Array:");
	        for (int i = 0; i < arr.length; i++) { 
	            for (int j = 0; j < arr[i].length; j++) { 
	                System.out.print(arr[i][j] + " "); 
	            }
	            System.out.println(); 
	        }
	    }
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.print("Enter the number of rows for the jagged array: ");
	        int rows = scan.nextInt(); 
	        
	        int[][] jaggedArray = createJaggedArray(rows); 
	        
	        printJaggedArray(jaggedArray);
	 }
}
