//19.Write a program to accept a number and print the Fibonacci series up to the entered number

package com.heraizen.cj.day1;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		
		int a=0;
		int b=1;
		int num;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the upper bound number to generate the Fibonacci numbers:");
		num=sc.nextInt();
		
		System.out.println("Fibonacci series up to the entered number is:");
		
		for(int i=1;i<=num;i++) {
			System.out.print(a+" ");
			
			int sum=a+b;
			a=b;
			b=sum;

		}
		
		
	}

}
