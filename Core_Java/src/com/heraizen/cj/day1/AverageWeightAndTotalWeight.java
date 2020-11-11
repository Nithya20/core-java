//2.Write a program to accept the weight of 3 persons, calculate the total weight, 
//determine the average weight and display these details.

package com.heraizen.cj.day1;

import java.util.Scanner;

public class AverageWeightAndTotalWeight {
	public static void main(String args[]) {
		double person1 ,person2,person3,totalWeight,AverageWeight;
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the weight of the first person:");
		 person1=sc.nextDouble();
		 
	     System.out.println("Enter the weight of the second person:");
	     person2=sc.nextDouble();
	     
	     System.out.println("Enter the weight of the third person");
	     person3=sc.nextDouble();
	     
	     totalWeight=person1+person2+person3;
	     AverageWeight=(totalWeight/3);
	     
	     System.out.println("The sum of weight of the 3 persons is " +totalWeight+ " Kgs and the average weight is " +AverageWeight+ " Kgs");
	     
	}

}
