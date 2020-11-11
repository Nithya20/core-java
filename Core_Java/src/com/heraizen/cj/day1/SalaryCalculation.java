//3.Write a program to accept the following details of an employee: 
//, name and monthly salary; calculate the yearly salary and display the result.
package com.heraizen.cj.day1;
import java.util.Scanner;

public class SalaryCalculation {
	public static void main(String args[]) {
		int empno;
		String name;
		double salary, yearlySalary;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter empno:");
		empno=sc.nextInt();
		
		System.out.println("Enter the employee name");
		name=sc.next();
		
		System.out.println("Enter the monthly salary");
		salary=sc.nextDouble();
		
		yearlySalary=(salary*12);
		
		System.out.println("Hi "+name+"! Your employee id is "+empno+", monthly salary is Rs "+salary+ " and yearly salary is Rs "+ yearlySalary+".");
		
	}

}
