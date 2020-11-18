/*9.Write a program to accept a number from the user and determine whether it is even or odd.*/

package com.heraizen.cj.day1;

import java.util.Scanner;

/**
 * @author Nithu
 *
 */
public class OddOrEven {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		double num = sc.nextDouble();

		if (num % 2 == 0) {
			System.out.println("The entered number " + num + " is even");
		} else {
			System.out.println("The entered number " + num + " is odd");
		}
		sc.close();
	}

}
