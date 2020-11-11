package com.heraizen.cj.day1;

import java.util.Scanner;

public class Question_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("\n Please Enter any Number: ");
		int n = s.nextInt();
		fact(n);
		

	}
	private static void fact(int n)
	{
		long fact = 1;
        int i = 1;
        while(i<=n)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+n+" is: "+fact);

	}

}
