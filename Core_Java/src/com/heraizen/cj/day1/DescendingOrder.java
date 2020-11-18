//17.   Write a program to generate the first 'N' natural numbers and print them in descending order.

package com.heraizen.cj.day1;

import java.util.Scanner;

public class DescendingOrder {
	public static void main(String args[]) {
		int n,i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of natural numbers to be generated");
		n=sc.nextInt();
		System.out.println("The first 5 natural numbers in descending order are:");
		for( i=n;i>=1;i--) {
			
				System.out.print(i+" ");
				sc.close();
			
		}
		
	}

}
