package com.gentech.static1;
class StaticBlock1{
	
		static String firstname;
		static int Salary;
		static int empid;
		static String Gender;
		static  {
			Gender="Male";
			firstname="Santhosh";
			Salary=1000000;
		     DisplayName();	
		     DisplaySalary();
		     DisplayEmpid() ;
		}
		static void DisplayName() {
			System.out.println(StaticBlock1.firstname+"This is Static Method");
			
		}
		static void DisplaySalary() {
			System.out.println(StaticBlock1.Salary+"This is Static Method");
			
		}
		static void DisplayEmpid() {
			StaticBlock1.empid=4786458;
			System.out.println(StaticBlock1.empid+"This is Static Method");
			
		}
		
		

}
public class Block {

	public static void main(String[] args) {
		StaticBlock1.firstname="kokila";
		StaticBlock1.Salary=30000;
		System.out.println(StaticBlock1.firstname+" "+StaticBlock1.Salary);

	}

}
