//15.   Write a program to generate the first 'N' natural numbers. Accept the value of 'N' from the user/.

package com.heraizen.cj.day1;

import java.util.Scanner;

public class NthNumber {
	public static void main(String args[]) {
		int n,i,number;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of natural numbers to be generated:");
		n=sc.nextInt();
		System.out.println("First 5 natural numbers are:");
		
		for( i=1;i<=n;i++) {
			  number=i;
			  System.out.println(+number);
			  sc.close();
				
		}
		
		
		
		
	}

}
