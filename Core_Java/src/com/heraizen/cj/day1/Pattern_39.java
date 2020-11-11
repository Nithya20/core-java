package com.heraizen.cj.day1;

import java.util.Scanner;

public class Pattern_39 {
	
	public static void main(String args[]) {
		int n;
		int k=1;
		int number=0;
		 Scanner sc= new Scanner(System.in) ;
			 
	     System.out.println("Enter the number");
	     n=sc.nextInt();
	     
	     for(int i=1;i<=n;i++) {
	    	 number+=i;
	    	 number*=10;
	    	 k*=10;
	     }
		 number/=10;
		 k/=10;
		 for(int i=1;i<=n;i++) {
			 System.out.println(number);
			 number=(number%10)*k+(number/10);
		 }
		 
	}

}
