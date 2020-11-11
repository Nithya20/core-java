//4. Write a program to accept two numbers from the user, swap their values and display the result.

package com.heraizen.cj.day1;
import java.util.Scanner;

public class SwappingTwoNumbers {
	public static void main(String args[]) {
		int num1,num2,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number num1");
		num1=sc.nextInt();
		
		System.out.println("Enter the second number num2");
		num2=sc.nextInt();
		
		System.out.println("Before swap, the values of num1="+num1+"= and num2="+num2);
		
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After swap, the values of num1="+num1+" and num2="+num2);
	}

}
