/*7.Write a program to accept the billing amount, if it is > 6000 then give a discount of 10% and display the net amount.*/

package com.heraizen.cj.day1;

import java.util.Scanner;

/**
 * @author Nithu
 *
 */
public class BillingAmountDiscount {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the billing amount:");
		int billingAmount = sc.nextInt();

		if (billingAmount > 6000) {
			billingAmount -= billingAmount * 0.1;
		}
		System.out.println("Your net billing amount:" + billingAmount);
		sc.close();
	}

}
