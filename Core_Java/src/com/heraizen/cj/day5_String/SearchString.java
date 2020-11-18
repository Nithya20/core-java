package com.heraizen.cj.day5_String;

import java.util.Scanner;

public class SearchString {

		public static void main(String[] args) {
			 Scanner scan = new Scanner(System.in);
			 System.out.println("Enter the group string separated by comma :");
			 String s = scan.nextLine();
			 System.out.println("Enter the string you want to search :");
			 String search = scan.nextLine();
			 String[] arr = s.split(",");
			 for(int i=0;i<arr.length;i++) {
				 if(arr[i].equals(search)) {
					 System.out.print("Postion of the string is :");
					 System.out.print(i+1);
				 }
			 }
			 scan.close();
			 
		}
	}


