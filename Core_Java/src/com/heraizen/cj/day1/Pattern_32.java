package com.heraizen.cj.day1;

public class Pattern_32 {
   public static void main(String args[]) {
	   char ch='A';
	   int n=3;
	   
	   for(int i=1;i<=n;i++) {
		   for(int j=1;j<=n;j++) {
			   System.out.print(ch +" ");
			   ch++;
		   }
		   System.out.println();
	   }
   }
}
