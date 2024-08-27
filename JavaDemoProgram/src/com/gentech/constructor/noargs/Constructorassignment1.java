package com.gentech.constructor.noargs;



class Employee{
	String Emp_name;
	int Emp_Id; 
	int age;
	int salary;
	Employee()
	{
		Emp_name="Rajesh";
		Emp_Id =35245;
		age=40;
		salary=20000;
		System.out.println("****Employee Details****");
		System.out.println( Emp_name+" "+ Emp_Id+" "+  age+" "+
				salary);
	}

}

class Insurance{
	int Policy_Number;
	String Emp_name;
	int Amount;
	Insurance(){
		Policy_Number=2443322;
		Emp_name="Rajesh";
		Amount=55000;
		System.out.println("****Insurance Details****");
		System.out.println(Policy_Number+" "+
				Emp_name+" "+
				Amount);
	}



}

class Department{
	int Emp_id;
	String Dept_Name;
	Department(){
		Emp_id=389378;
		Dept_Name="Backend";
		System.out.println("****Department Details****");
		System.out.println(Emp_id+" "+
				Dept_Name);
	}
}

public class Constructorassignment1 {

	public static void main(String[] args) {

		Employee emp=new Employee();

		Department Dept=new Department();

		Insurance Ins=new Insurance();


	}

}
