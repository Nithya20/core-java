/*2. Write a program to accept N value and create the array size N. Find the biggest and the smallest   elements in the array*/

package com.heraizen.cj.day3;

import java.util.Scanner;

/**
 * @author Nithu
 *
 */
public class BiggestAndSmallestInArray {

	public static void main(String[] args) {
		int max, min;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array");
		int size = sc.nextInt();

		System.out.println("Enter the " + size + " elements in the array");
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		max = arr[0];
		min = arr[0];
		for (int i = 0; i < size; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}

		}
		System.out.println("biggest number of array is:" + max);
		System.out.println("Smallest number of array is:" + min);
		sc.close();

	}

}
