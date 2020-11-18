//12.In a shopping mall, privileged customers (if they have a membership card) are being given a 10% discount on the billed amount, and the others are being given a 3% discount.
//Write a program to accept the billing amount and confirm the membership card from the customer; calculate
//and display the net amount to be paid by the customer.

package com.heraizen.cj.day1;

import java.util.Scanner;

public class PrivilegedCustomerDiscount {
	public static void main(String args[]) {
		int billAmount,discount,TotalbillAmount;
		String ans;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bill amount:");
		TotalbillAmount=sc.nextInt();
		
		System.out.println("Do you have a membership card?");
		ans=sc.next();
		ans=ans.toUpperCase();
		
		if(ans.equals("Y")){
		    discount=(TotalbillAmount*10/100);
			billAmount=TotalbillAmount-discount;
			System.out.println("Thank you! Your total bill amount is Rs "+TotalbillAmount+", discount is Rs "+discount+" and net amount payable is Rs "+billAmount+".");
		}
		else {
			discount=(TotalbillAmount*3/100);
			billAmount=TotalbillAmount-discount;
			System.out.println("Thank you! Your total bill amount is Rs "+TotalbillAmount+", discount is Rs "+discount+" and net amount payable is Rs "+billAmount+".");
			
		}
		
		
		
	}

}
