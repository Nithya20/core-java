package com.heraizen.cj.day5_String;

import java.util.Scanner;

public class LengthOfString {

	 static boolean isPalindrome(String str) 
	    { 
	        int i = 0, j = str.length() - 1; 
	  
	    
	        while (i < j) { 
	            if (str.charAt(i) != str.charAt(j)) 
	                return false; 
	            i++; 
	            j--; 
	        } 
	        return true; 
	    } 
	  

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str= scan.nextLine();
		System.out.println("Length of string is: "+ str.length());
		System.out.println("string in uppercase: "+ str.toUpperCase());
		System.out.println("string in uppercase: "+ str.toLowerCase());
		if (isPalindrome(str)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
		scan.close();
	}

}
