package com.heraizen.cj.day1;

public class Pattern_33 {
	public static void main(String args[]) {
		int n=4;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
			
	}

}
