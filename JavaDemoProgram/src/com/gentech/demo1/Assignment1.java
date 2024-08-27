package com.gentech.demo1;

class Employee{
	String Emp_name;
	int Emp_Id; 
	int age;
	int salary;
	
}

class Insurance{
	int Policy_Number;
	String Emp_name;
	int Amount;
	
	
}

class Department{
	int Emp_id;
	String Dept_Name;
	
}

public class Assignment1 {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp. Emp_name="Rajesh";
		emp. Emp_Id =35245;
		emp. age=40;
		emp. salary=20000;
		Department Dept=new Department();
		Dept.Emp_id=389378;
		Dept.Dept_Name="Backend";
		Insurance Ins=new Insurance();
		Ins.Policy_Number=2443322;
		Ins.Emp_name="Rajesh";
		Ins.Amount=55000;
	
		System.out.println("Employee Details");
		System.out.print(emp.Emp_name + " ");
		System.out.print(emp.Emp_Id + " ");
		System.out.print(emp.age + " ");
		System.out.println(emp.salary);

		System.out.println("Department Details");
		System.out.print(Dept.Emp_id + " ");
		System.out.println(Dept.Dept_Name);

		System.out.println("Insurance Details");
		System.out.print(Ins.Policy_Number + " ");
		System.out.print(Ins.Emp_name + " ");
		System.out.println(Ins.Amount);

		
	}

}
