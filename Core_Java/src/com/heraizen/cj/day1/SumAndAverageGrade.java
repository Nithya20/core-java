//  14. Write a program to accept the marks scored in three subjects;
//   determine the sum and average of the entered marks. Grade is awarded based on following criteria.

package com.heraizen.cj.day1;

import java.util.Scanner;

public class SumAndAverageGrade {
	public static void main(String args[]) {
		double sub1,sub2,sub3,totalMarks,average;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks scored in 1st subject:");
		sub1=sc.nextDouble();
		
		System.out.println("Enter the marks scored in 2nd subject:");
		sub2=sc.nextDouble();
		
		System.out.println("Enter the marks scored in 3rd subject:");
		sub3=sc.nextDouble();
		
		totalMarks=sub1+sub2+sub3;
		average=totalMarks/3;
		System.out.println("Total marks:"+totalMarks);
		System.out.println("average is:"+average);
		
		if(average<=35) {
			System.out.println("Grade: “C”");
		}
		else if(average>35 && average>=60) {
			System.out.println("Grade: “B”");
		}
		else {
			System.out.println("Grade: “A”");
		}
		
	}

}
