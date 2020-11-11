package com.heraizen.cj.day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int num;
		int fac=1;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any number:");
		num=sc.nextInt();
		
		for(int i=num;i>0;i--) {
			fac=fac*i;
		}
		System.out.print("The factorial of "+num+" is "+fac);
	}

}
