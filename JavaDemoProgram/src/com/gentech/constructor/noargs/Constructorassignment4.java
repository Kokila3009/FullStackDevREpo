package com.gentech.constructor.noargs;



class Product {
	String productName;
	double price;
	String category;
	Product(){
		productName = "Laptop";
		price = 800002.0;
		category = "Electronics";
		System.out.println("****Inventory Details****");
		System.out.println(productName +" "+
				price  +" "+
				category);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}



class Inventory {
	String productName;
	int quantity;
	String location;
	Inventory(){
		productName = "Laptop";
		quantity = 10;
		location = "Warehouse A";
		System.out.println("****Inventory Details****");
		System.out.println(productName +" "+quantity +" "+
				location 
				);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}

class Sales {
	String productName;
	double amount;
	String customerName;
	Sales(){
		productName = "Laptop";
		amount = 80000.0;
		customerName = "Rajesh";
		System.out.println("****Sales Details****");
		System.out.println(productName + " "+amount + " "+customerName 
				);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}


}

class Order {
	int orderId;
	String productName;
	int quantity;
	String customerName;
	Order (){
		orderId = 1;
		productName = "Laptop";
		quantity = 2;
		customerName = "Ankith";

		System.out.println("****Orders Details****");
		System.out.println(orderId + " "+
				productName + " "+
				quantity + " "+
				customerName );
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 

	}
}

public class Constructorassignment4{

	public static void main(String[] args) {

		Product product = new Product();


		Inventory inventory = new Inventory();


		Sales sales = new Sales();


		Order order = new Order();

	}

}