package com.heraizen.cj.day1;

public class Pattern_31 {
	public static void main(String args[]) {
		int n=3;
		int multiple=19;
		int k=1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				int ans=k*multiple;
				k++;
				System.out.print(ans +" ");
			}
		System.out.println();
		}
	}
}
