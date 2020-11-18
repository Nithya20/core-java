/*1. Write a program to create class Student with id, name, address , display(),Student(id,name). Create
several objects and initialize them. Display the details of each student and finally display the number of
student objects that are created.
*/

package com.heraizen.cj.day5;

/**
 * @author Nithu
 *
 */
class Student{
	int id;
	String name;
	void Student(int i,String s) {
	    id=i;
		name=s;
		
		
	}
	void display() {
		System.out.println(id+" "+name);

	}

}

public class CreateNoOfObject_1 {

	public static void main(String[] args) {
		
		
    Student s1=new Student();
    Student s2=new Student();
    Student s3=new Student();
    Student s4=new Student();
    Student s5=new Student();
    
    s1.Student(101,"nithu");
    s1.display();
    s2.Student(102,"sathya");
    s2.display();
    s3.Student(103,"krishna");
    s3.display();
    s4.Student(104,"sona");
    s4.display();
    s5.Student(105,"priya");
    s5.display();
    
	}

}
