//13.Write a program to accept 3 numbers from the user and find the biggest of them.

package com.heraizen.cj.day1;

import java.util.Scanner;

public class BiggestThree {
	public static void main(String args[]) {
		int num1,num2,num3;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number num1:");
		num1=sc.nextInt();
		
		System.out.println("Enter the 2nd number num2:");
		num2=sc.nextInt();
		
		System.out.println("Enter the 3rd number num3:");
		num3=sc.nextInt();
		
		if(num1 >num2 && num1>num3) {
			System.out.println("The biggest of the 3 numbers entered is:"+num1);
		}
		else if(num2>num1 &&num2>num3){
			System.out.println("The biggest of the 3 numbers entered is:"+num2);
				
		}
		else {
		System.out.println("The biggest of the 3 numbers entered is:"+num3);
		}
	}

}
