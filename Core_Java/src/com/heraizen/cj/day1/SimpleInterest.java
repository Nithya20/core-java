//5.Write a program to accept the principal amount, rate of interest, time and calculate the simple interest.


package com.heraizen.cj.day1;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String args[]) {
		double p,t,r,si;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal amount:");
		p=sc.nextDouble();
		
		System.out.println("Enter the rate of interest");
		r=sc.nextDouble();
		
		System.out.println("Enter the time (years)");
		t=sc.nextDouble();
		
		si=((p*t*r)/100);
		System.out.println("Simple interest is "+si);
		
		
	}

}
