

package com.heraizen.cj.day1;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String args[]) {
		
		int num;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number to generate its multiplication table:");
		num=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			int multiplication=i*num;
			System.out.println(num +" * "+i+" = "+multiplication);
			
		}
		sc.close();
		
	}

}
