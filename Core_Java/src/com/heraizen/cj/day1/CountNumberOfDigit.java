package com.heraizen.cj.day1;

import java.util.Scanner;

public class CountNumberOfDigit {
	
	public static void main(String args[]) {
		
	   int n;
	   int i=0;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter any number:");
	   n=sc.nextInt();
	   
	   while(n!=0) {
		   n=n/10;
		   i++;
	   }
	   System.out.println("The number of digits in the entered number is "+i);
	}

}
