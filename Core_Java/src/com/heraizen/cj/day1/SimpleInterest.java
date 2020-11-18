/*5.Write a program to accept the principal amount, rate of interest, time and calculate the simple interest.*/

package com.heraizen.cj.day1;

import java.util.Scanner;

/**
 * @author Nithu
 *
 */
public class SimpleInterest {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount:");
		double p = sc.nextDouble();

		System.out.println("Enter the rate of interest");
		double r = sc.nextDouble();

		System.out.println("Enter the time (years)");
		double t = sc.nextDouble();

		double si = (p * t * r) / 100;
		System.out.println("Simple interest is " + si);
		sc.close();

	}

}
