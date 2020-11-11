//8.The Sports Club registration form has the following details: name, mobile number and age. 
//Per the membership policy, the person should be at least 18 years old to become a member. 
//Write a program to accept the details mentioned above; if the age is >18 years then display the entered
//details with a congratulation message, else the following message should be displayed “Sorry! 
//You need to be at least 18 years old to get membership.”

package com.heraizen.cj.day1;

import java.util.Scanner;

public class Membership {
	public static void main(String args[]) {
		String name;
		long mobileNum;
		int age;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		name=sc.next();
		
		System.out.println("Enter the mobile number:");
		mobileNum=sc.nextLong();
		
		System.out.println("Enter the age:");
		age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("Congratulations "+name+" for your successful registration.");
			return;
		}
		
		System.out.println("Sorry! You need to be at least 18 years old to get membership.");
		
		
	}
	

}
