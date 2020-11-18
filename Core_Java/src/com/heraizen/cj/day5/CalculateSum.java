package com.heraizen.cj.day5;

public class CalculateSum {
	int num1;
	int num2;
	int sum;
	void sum(int i,int j) {
		num1=i;
		num2=j;
		sum=num1+num2;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		CalculateSum c=new CalculateSum();
		c.sum(20,30);
	}
}
 