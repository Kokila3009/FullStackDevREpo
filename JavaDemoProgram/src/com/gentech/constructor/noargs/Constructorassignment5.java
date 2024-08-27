package com.gentech.constructor.noargs;


class Sports {
	String sportName;
	String coachName;
	int numberOfPlayers;

	Sports() {
		sportName = "Football";
		coachName = "Alex";
		numberOfPlayers = 11;
		System.out.println("****Sports Details****");
		System.out.print(sportName + " ");
		System.out.print("Coach Name: " + coachName + " ");
		System.out.print("Number of Players: " + numberOfPlayers);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}

class ComputerDepartment {
	String departmentName;
	String labLocation;
	int numberOfComputers;

	ComputerDepartment() {
		departmentName = "Computer Science";
		labLocation = "Lab A";
		numberOfComputers = 30;
		System.out.println("****Computer Department Details****");
		System.out.println("Department Name: " + departmentName + " " + "Lab Location: " + labLocation + " " + "Number of Computers: " + numberOfComputers);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}

class Library {
	String bookName;
	String author;
	int quantity;

	Library() {
		bookName = "Java Programming";
		author = "Smitha";
		quantity = 20;
		System.out.println("****Library Details****");
		System.out.println("Book Name: " + bookName + " " + "Author: " + author + " " + "Quantity: " + quantity);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}

class Student {
	String studentName;
	int age;
	String department;

	Student() {
		studentName = "Kokila";
		age = 22;
		department = "Computer Science";
		System.out.println("****Student Details****");
		System.out.println("Student Name: " + studentName + " " + "Age: " + age + " " + "Department: " + department);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}

public class Constructorassignment5 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Library library = new Library();
		Sports sports = new Sports();
		ComputerDepartment c1 = new ComputerDepartment();
	}
}

