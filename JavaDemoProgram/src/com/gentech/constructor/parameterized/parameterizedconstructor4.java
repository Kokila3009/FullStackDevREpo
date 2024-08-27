package com.gentech.constructor.parameterized;



class Product {
	String productName;
	double price;
	String category;

	Product(String prodName, double priceVal, String cat) {
		productName = prodName;
		price = priceVal;
		category = cat;
		System.out.println("****Product Details****");
		System.out.println(productName + " " + price + " " + category);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}

class Inventory {
	String productName;
	int quantity;
	String location;

	Inventory(String prodName, int qty, String loc) {
		productName = prodName;
		quantity = qty;
		location = loc;
		System.out.println("****Inventory Details****");
		System.out.println(productName + " " + quantity + " " + location);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}

class Sales {
	String productName;
	double amount;
	String customerName;

	Sales(String prodName, double amt, String custName) {
		productName = prodName;
		amount = amt;
		customerName = custName;
		System.out.println("****Sales Details****");
		System.out.println(productName + " " + amount + " " + customerName);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}

class Order {
	int orderId;
	String productName;
	int quantity;
	String customerName;

	Order(int ordId, String prodName, int qty, String custName) {
		orderId = ordId;
		productName = prodName;
		quantity = qty;
		customerName = custName;
		System.out.println("****Orders Details****");
		System.out.println(orderId + " " + productName + " " + quantity + " " + customerName);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}

public class parameterizedconstructor4 {

	public static void main(String[] args) {
		Product product = new Product("Laptop", 800002.0, "Electronics");
		Inventory inventory = new Inventory("Laptop", 10, "Warehouse A");
		Sales sales = new Sales("Laptop", 80000.0, "Rajesh");
		Order order = new Order(1, "Laptop", 2, "Ankith");
	}
}
