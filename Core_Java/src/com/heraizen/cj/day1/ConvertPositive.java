/*6.Write a program to accept a number, if it is negative then covert it to a positive number.*/

package com.heraizen.cj.day1;

import java.util.Scanner;

/**
 * @author Nithu
 *
 */
public class ConvertPositive {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();

		if (num < 0) {
			num = -(num);
		}
		System.out.println("The result is " + num);
		sc.close();

	}

}
