package com.heraizen.cj.day1;

import java.util.Scanner;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Operand num1:");
		num1=sc.nextInt();
		System.out.println("Enter the 2nd Operand num2:");
		num2=sc.nextInt();
		System.out.println("1. add 2. mul 3. div 4. mod ");
		
		System.out.println("Enter the Operator");
		i=sc.nextInt();
		
		switch(i) {
		case 1:
			int add=num1+num2;
			System.out.println(add+" ");
			break;

		case 2:
			int mul=num1*num2;
			System.out.println(mul+" ");
			break;
			
		case 3:
			int div=num1/num2;
			System.out.println(div+" ");
			break;
			
		case 4:
			int mod=num1%num2;
			System.out.println(mod+" ");
			break;
			
		}
		sc.close();

	}

}
