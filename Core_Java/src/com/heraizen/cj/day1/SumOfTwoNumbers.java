//1.Write a program to accept two numbers from the user, calculate the sum and display the same.


package com.heraizen.cj.day1;
import java.util.Scanner;

public class SumOfTwoNumbers {
	public static void main(String args[]) {
		int num1;
		int num2;
		int sum;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the num1 value : ");
		num1=sc.nextInt();
		
		System.out.println("Enter the num2 value : ");
		num2=sc.nextInt();
		
		sum=num1+num2;
		
		System.out.println("Sum of " +num1 + " and " + num2 +" is " + sum);
	}

}
