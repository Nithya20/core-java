package com.heraizen.cj.day5_String;

import java.util.Scanner;

public class FullName {
	public class Fullname {
		
		public void display() {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter firstName: ");
			String firstName =scan.nextLine();
			System.out.print("Enter middleName: ");
			String middleName =scan.nextLine();
			System.out.print("Enter lastName: ");
			String lastName =scan.nextLine();
			System.out.println("Fullname is: "+firstName+"-"+middleName+"-"+lastName);
			scan.close();
			
		}
			
			public static void main(String[] args) {
				Fullname fn = new Fullname();
				fn.display();

			}

		}

}
