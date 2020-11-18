/*2.Write a program to accept the weight of 3 persons, calculate the total weight, determine the average weight and display these details.*/

package com.heraizen.cj.day1;

import java.util.Scanner;

/**
 * @author Nithu
 *
 */
public class AverageWeightAndTotalWeight {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight of the first person:");
		double person1 = sc.nextDouble();

		System.out.println("Enter the weight of the second person:");
		double person2 = sc.nextDouble();

		System.out.println("Enter the weight of the third person");
		double person3 = sc.nextDouble();

		double totalWeight = person1 + person2 + person3;
		double AverageWeight = (totalWeight / 3);

		System.out.println("The sum of weight of the 3 persons is " + totalWeight + " Kgs and the average weight is "
				+ AverageWeight + " Kgs");
		sc.close();

	}

}
