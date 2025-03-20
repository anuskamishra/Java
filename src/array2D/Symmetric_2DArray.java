package array2D;

import java.util.Scanner;

public class Symmetric_2DArray {

    public static int[][] create2DArray(int size) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[size][size];

        System.out.println("Enter " + (size * size) + " elements for the " + size + "x" + size + " matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        return arr; 
    }

    public static boolean isSymmetric(int[][] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i][j] != arr[j][i]) {  // Symmetry condition
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int size = 3; 
        int[][] matrix = create2DArray(size); 

        System.out.println("The entered 2D array is:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        if (isSymmetric(matrix)) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }
}
