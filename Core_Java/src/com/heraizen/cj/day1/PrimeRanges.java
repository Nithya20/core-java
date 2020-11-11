

package com.heraizen.cj.day1;

import java.util.Scanner;

public class PrimeRanges {
	public static void main(String args[]) {
		int num1,num2,i,j;
		boolean flag = false;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the lower bound value:");
		num1=sc.nextInt();
		
		System.out.println("Enter the upper bound value:");
		num2=sc.nextInt();
		
		System.out.println("The prime numbers between "+num1+"0 and "+num2+" are:");
		
		for(i=num1;i<=num2;i++) {
		 
			if(num1==0 ||num1==1) {
				continue;
			}
			flag=true;
			
			for(j=2;j<i/2;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
				
			
			}
			 if(flag ==true) {
				 System.out.print(i+" ");
			 }
		}
		
	
		
	}

}
