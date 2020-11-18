/*11.Write a program to accept two numbers num1 and num2; when one is subtracted from the other, the result should always be a positive number.*/

package com.heraizen.cj.day1;

import java.util.Scanner;

/**
 * @author Nithu
 *
 */
public class DifferenceToBePositive {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number num1:");
		int num1 = sc.nextInt();

		System.out.println("Enter the second number num2:");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			int difference = num1 - num2;
			System.out.println("The result (difference) is: " + difference);
		} else {
			int difference = num2 - num1;
			System.out.println("The result (difference) is: " + difference);
		}
		sc.close();

	}

}
