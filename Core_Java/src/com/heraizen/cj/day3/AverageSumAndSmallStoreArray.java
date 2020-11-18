/*3. Write a program that allows you to create an integer array of 18 elements with the following values: 
int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,2,0,0,0,}. The program computes the sum of element 0 to 14 and stores it at element 15, 
computes the average and stores it at element 16 and identifies the smallest value from the array and stores it at element 17.
*/

package com.heraizen.cj.day3;

/**
 * @author Nithu
 *
 */
public class AverageSumAndSmallStoreArray {

	public static void main(String[] args) {

		int sum = 0;
		int average, min;
		int A[] = new int[] { 3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 2, 0, 0, 0 };

		for (int i = 0; i < 14; i++) {
			sum += A[i];
			average = sum / 14;
			min = A[1];

			if (min > A[i]) {
				min = A[i];
			}

			A[16] = min;
			A[15] = average;
			A[14] = sum;

		}
		System.out.print("Result of Array ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}

	}

}
