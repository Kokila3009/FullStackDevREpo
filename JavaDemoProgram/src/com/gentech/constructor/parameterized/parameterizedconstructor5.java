package com.gentech.constructor.parameterized;



class Sports {
	String sportName;
	String coachName;
	int numberOfPlayers;

	Sports(String sport, String coach, int players) {
		sportName = sport;
		coachName = coach;
		numberOfPlayers = players;
		System.out.println("****Sports Details****");
		System.out.println(sportName + "  " + "Coach Name: " + coachName + " " + "Number of Players: " + numberOfPlayers);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}

class ComputerDepartment {
	String departmentName;
	String labLocation;
	int numberOfComputers;

	ComputerDepartment(String deptName, String labLoc, int numComputers) {
		departmentName = deptName;
		labLocation = labLoc;
		numberOfComputers = numComputers;
		System.out.println("****Computer Department Details****");
		System.out.println("Department Name: " + departmentName + " " + "Lab Location: " + labLocation + " " + "Number of Computers: " + numberOfComputers);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}

class Library {
	String bookName;
	String author;
	int quantity;

	Library(String book, String auth, int qty) {
		bookName = book;
		author = auth;
		quantity = qty;
		System.out.println("****Library Details****");
		System.out.println("Book Name: " + bookName + " " + "Author: " + author + " " + "Quantity: " + quantity);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}

class Student {
	String studentName;
	int age;
	String department;

	Student(String name, int studentAge, String dept) {
		studentName = name;
		age = studentAge;
		department = dept;
		System.out.println("****Student Details****");
		System.out.println("Student Name: " + studentName + " " + "Age: " + age + " " + "Department: " + department);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}

public class parameterizedconstructor5 {
	public static void main(String[] args) {
		Student s1 = new Student("Kokila", 22, "Computer Science");
		Library library = new Library("Java Programming", "Smitha", 20);
		Sports sports = new Sports("Football", "Alex", 11);
		ComputerDepartment c1 = new ComputerDepartment("Computer Science", "Lab A", 30);
	}
}

