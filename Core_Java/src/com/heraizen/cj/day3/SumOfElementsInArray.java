/*1. Write a program to accept N value and create the array size N. Find the sum of elements in the array.*/

package com.heraizen.cj.day3;

import java.util.Scanner;

/**
 * @author Nithu
 *
 */
public class SumOfElementsInArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the size of an array");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("please enter the " + n + " elements of an array");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of the elements in the array:"+sum);
		sc.close();
	}

}
