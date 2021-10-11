package matrix.main;

import java.util.Scanner;

public class ReverseMatrix {
	public static void main(String[] args) {
//		int[][] arr = { { 1, 2 }, 
//						{ 3, 4 } }; 
		String r = "row";
		String c = "column";
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] array = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		Scanner sc1=new Scanner(System.in);
		String input = sc1.nextLine();
		if (input.equals(r)) {
			row(array);
		} else if (input.equals(c)) {
			column(array);
		} else {
			System.out.println("Give the correct input");
		}

	}

	static void row(int[][] arr) {
		for (int row = 1; row >= 0; row--) {
			for (int col = 0; col < arr.length; col++) {
				System.out.print(arr[row][col]);
				if (col != arr.length - 1) {
					System.out.print(",");
				}

			}
			System.out.println();
		}

	}

	static void column(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 1; col >= 0; col--) {
				System.out.print(arr[row][col]);
				if (col == arr.length - 1) {
					System.out.print(",");
				}

			}
			System.out.println();
		}
	}

}
