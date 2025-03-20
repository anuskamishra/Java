package array2D;

import java.util.Scanner;
import java.util.Arrays;

public class Array2D {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}
        
		System.out.println(Arrays.deepToString(arr));
		//using for each loop
		for (int[] row : arr) {   
            for (int value : row) { 
                System.out.print(value + " ");
            }
            System.out.println(); 
        }
	}
}
