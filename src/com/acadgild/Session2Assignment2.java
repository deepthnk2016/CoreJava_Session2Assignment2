package com.acadgild;

/**
 * 
 * @author 	Deepak
 * @date	26/05/2017
 * @desc	Print pyramid structure
 * 			This program will accept rows you want in the pyramid
 * 			and it will print the pyramid with that many rows
 */
import java.util.Scanner;
class Session2Assignment2 {

	public static void main(String args[]) {
		int i = 1, j = 1, k = 1, l = 1, m = 1, x = 1;
		String str = "";
		String revstr = "";
		String separator = " ";
		
		//Get the number of rows for the grid.
		System.out.println("Enter no of rows in the grid - ");
		Scanner s = new Scanner(System.in);
		int rows=s.nextInt();// no of rows in the pyramid
		
		int mid = (rows - 1) / 2 + 1; // set the number to which increment needs
										
		// loop till increment happens
		for (i = 1; i <= mid; i++) {
			l = 1;

			// print spaces till mid
			while (l <= mid - i) {
				System.out.print(" " + separator + " ");
				l++;
			}

			// print the increment sequence till mid
			// 96 is added to display a,b,c etc...
			while (j <= i) {
				str = (String) str + " " + (char)(j+96) + " ";
				j++;
			}
			System.out.print(str);
			
			// print the decrement sequence
			// 96 is added to display a,b,c etc...
			while (k < i) {
				revstr = " " + (char)(k+96) + " " + (String) revstr;
				k++;
			}
			System.out.print(revstr);
			m = 1;
			System.out.println("");
		}
		//print the reverse triangle
		for (x = mid - 1; x >= 1; x--) {

			j = 1;
			k = 1;
			m = 1;
			l = 1;
			str = "";
			revstr = "";

			// print spaces
			while (m <= mid - x) {
				System.out.print(" " + separator + " ");
				m++;
			}

			// print increment sequence
			while (j <= x) {
				str = (String) str + " " + (char)(j+96) + " ";
				j++;
			}
			System.out.print(str);
			
			// print decrement sequence
			while (k <= x - 1) {
				revstr = " " + (char)(k+96) + " " + (String) revstr;
				k++;
			}
			System.out.print(revstr);

			// print remaining spaces.
			while (l <= mid - x) {
				System.out.print(" " + separator + " ");
				l++;
			}
			System.out.println("");
		}
		s.close();
	}

}