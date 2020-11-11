//9.Write a program to accept a number from the user and determine whether it is even or odd.

package com.heraizen.cj.day1;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String args[]) {
		
		double num;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=sc.nextDouble();
		
		if(num%2==0) {
			System.out.println("The entered number "+num+" is even");
		}
		else {
			System.out.println("The entered number "+num+" is odd");
		}
	}

}
