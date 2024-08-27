package com.gentech.constructor.parameterized;

class Employee {
	String empName;
	int empId;
	int age;
	int salary;


	Employee(String empName, int empId, int age, int salary) {
		empName = empName;
		empId = empId;
		age = age;
		salary = salary;
		System.out.println("****Employee Details****");
		System.out.println(empName + " " + empId + " " + age + " " + salary);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}

class Insurance {
	int policyNumber;
	String empName;
	int amount;

	// Parameterized constructor
	Insurance(int policyNumber, String empName, int amount) {
		policyNumber = policyNumber;
		empName = empName;
		amount = amount;
		System.out.println("****Insurance Details****");
		System.out.println(policyNumber + " " + empName + " " + amount);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}

class Department {
	int empId;
	String deptName;


	Department(int empId1, String deptName1) {
		empId = empId1;
		deptName = deptName1;
		System.out.println("****Department Details****");
		System.out.println(empId1 + " " + deptName1);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}

public class parameterizedconstructor1  {
	public static void main(String[] args) {

		Employee emp = new Employee("Rajesh", 35245, 40, 20000);
		Department dept = new Department(389378, "Backend");
		Insurance ins = new Insurance(2443322, "Rajesh", 55000);

	}
}
