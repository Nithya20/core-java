//6.Write a program to accept a number, if it is negative then covert it to a positive number.

package com.heraizen.cj.day1;
import java.util.Scanner;

public class CovertPositive {
	public static void main(String args[]) {
		int num;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		num =sc.nextInt();
		
		if(num<0) {
			num=-(num);
		}
		System.out.println("The result is "+num);
		
	}

}
