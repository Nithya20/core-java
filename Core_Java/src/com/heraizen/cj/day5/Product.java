package com.heraizen.cj.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
	

		private int pid;
		private String pname;
		private double price;
//		public static String[] arr;

		public Product(int pid, String pname, double price) {
			this.pid = pid;
			this.pname = pname;
			this.price = price;
		}

		public void setValue(int pid, String pname, double price) {
			
			this.pid = pid;
			this.pname = pname;
			this.price = price;
//			sc.close();
			List<Product> allProducts = new ArrayList<Product>();
		}

		public void display(List<Product> allProducts) {
			for (Product items : allProducts) {
				System.out.println(items);
			}
		}

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter product id: ");

			System.out.print("Enter product name: ");

			sc.nextLine();
			System.out.print("Enter product price: ");


		}

	}

