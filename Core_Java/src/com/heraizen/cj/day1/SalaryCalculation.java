/*3.Write a program to accept the following details of an employee: , name and monthly salary; calculate the yearly salary and display the result.*/
package com.heraizen.cj.day1;

import java.util.Scanner;

/**
 * @author Nithu
 *
 */
public class SalaryCalculation {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empno:");
		int empno = sc.nextInt();

		System.out.println("Enter the employee name");
		String name = sc.next();

		System.out.println("Enter the monthly salary");
		int salary = sc.nextInt();

		int yearlySalary = (salary * 12);

		System.out.println("Hi " + name + "! Your employee id is " + empno + ", monthly salary is Rs " + salary
				+ " and yearly salary is Rs " + yearlySalary + ".");
		sc.close();

	}

}
