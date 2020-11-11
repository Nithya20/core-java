//7.Write a program to accept the billing amount, if it is > 6000 then give a 
//discount of 10% and display the net amount.


package com.heraizen.cj.day1;

import java.util.Scanner;

public class Discount {
	public static void main(String args[]) {
		int billingAmount;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the billing amount:");
		billingAmount=sc.nextInt();
		
		if(billingAmount>6000){
			billingAmount=(billingAmount)-((billingAmount*10)/100);		
		}
		System.out.println("Your net billing amount:"+billingAmount);
	}

}
