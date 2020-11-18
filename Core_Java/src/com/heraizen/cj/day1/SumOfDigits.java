package com.heraizen.cj.day1;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("\n Please Enter any Number: ");
		int n = s.nextInt();
		int res=sum(n);
		System.out.println(res);
		
	}
	
	private static int sum(int n)
	{
		int s=0,m;
		while(n>0)
		{
		
		m=n%10;
		s =s +m;
		n=n/10;
		}
		if(s>9)
		{
			s=sum(s);
		}
		
		return s;
	}

}
