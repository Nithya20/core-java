//16.   Write a program to accept a number and determine whether it is a prime number or not.

package com.heraizen.cj.day1;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String args[]) {
		int n;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		n=sc.nextInt();
		
		for(int i=2;i<n/2;i++) {
			if(n%i ==0) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("The entered number "+n+" is not a prime number");
			
		}
		else {
			System.out.println("The entered number "+n+" is a prime number");
		}
	}

}
