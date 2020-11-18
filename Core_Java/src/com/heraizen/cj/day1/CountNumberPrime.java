package com.heraizen.cj.day1;

import java.util.Scanner;

public class CountNumberPrime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n= s.nextInt();
		int m,k=0;
		while(n>0)
		{
			m=n%10;
			n=n/10;
			int count =0;
	        for(int i=2;i<=m/2;i++)
	        {
	        	if(m%i==0)
	        	{
	        		count++;
	        	}
	        }
	        if(count==0&&!(m<=1))
	        {
	        	k++;
	        }
			
			
		}
		System.out.println(k);
		s.close();
	}

}
