package com.heraizen.cj.day1;

import java.util.Scanner;

public class Pattern_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        int a=1;
        
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		
      
       for(int i=1;i<=n;i++) {
    	   for(int j=1;j<=i;j++) {
    		   System.out.print(a++ +" ");
    	   }
    	   System.out.println();
       }
	}

}
