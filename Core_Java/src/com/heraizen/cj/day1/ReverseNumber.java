package com.heraizen.cj.day1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any number:");
		n=sc.nextInt();
		
		System.out.println("Reverse of the entered number is ");
		
		while(n!=0) {
			int m=n%10;
			System.out.print(m+" ");
			n=n/10;
		}
		
		

	}

}
