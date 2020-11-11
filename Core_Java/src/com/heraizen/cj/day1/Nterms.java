package com.heraizen.cj.day1;

import java.util.Scanner;

public class Nterms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    {

	        double sum = 0;

	        int n;

	        System.out.println("1/1! + 2/2! + 3/3! + ..N/N!");

	        Scanner s = new Scanner(System.in);

	        System.out.print("Enter the no. of terms in series:");

	        n = s.nextInt();

	        Nterms obj = new Nterms();

	        for(int i = 1; i <= n; i++)

	        {

	            sum = sum + (double)i / (obj.fact(i));

	        }

	        System.out.println("Sum of series:"+sum);
	    }

	    }

	    int fact(int x)

	    {

	        int mul = 1;

	        while(x > 0)

	        {

	            mul = mul * x;

	            x--;

	        }

	        return mul;

	    

	}

}
