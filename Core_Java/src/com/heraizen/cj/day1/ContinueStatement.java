package com.heraizen.cj.day1;

import java.util.Scanner;

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n= sc.nextInt();
		int i, j; 

        for(i=1; i<=n; i++)
		{
			
			for(j=1; j<=n; j++)
			{
				if(i!=j)
				{
					System.out.println(i+" "+j);
				}
			}
		}

	}

}
