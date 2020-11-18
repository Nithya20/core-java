package com.heraizen.cj.day5_String;

import java.util.Scanner;

public class ConsonentsOrNot {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter string :");
			String str= scan.nextLine();
			int vcount = 0, ccount = 0;           
			
	        str = str.toLowerCase();
	        for(int i = 0; i < str.length(); i++) { 
	        	char ch = str.charAt(i); 
	        	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
	        	{ 
	        		vcount++; 
	        	} 
	        	else if((ch >= 'a'&& ch <= 'z'))
	        	{
	                ccount++;
	            }
	        }
	        System.out.println("Number of Vowels: " + vcount);
	        System.out.println("Number of Consonants: " + ccount);
			
	        scan.close();
		}

	}


