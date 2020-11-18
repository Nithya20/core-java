package com.heraizen.cj.day5_String;

import java.util.Scanner;

public class CountTheString {


		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter a String value: ");
			char[] s=sc.nextLine().toCharArray();
			int number=0;
			int space=0;
			int charecter=0;
			int other=0;


			for(int i=0;i<=s.length-1;i++){
			if(Character.isAlphabetic(s[i])){
				charecter++ ;
			}
			else if(Character.isDigit(s[i])){
				number++;
			}
			else if(Character.isSpaceChar(s[i])){
			space++;
			}
			else{other++;}
			}
			

			System.out.println("the no of digits: "+number);
			System.out.println("the no of characters: "+charecter);
			System.out.println("the no of space: "+space);
			System.out.println("the no of otherSymbols: "+other);
			sc.close();
		}

	}


