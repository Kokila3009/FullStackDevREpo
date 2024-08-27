package com.gentech.demo1;

class Product {
    String productName;
    double price;
    String category;
}



class Inventory {
    String productName;
    int quantity;
    String location;
}

class Sales {
    String productName;
    double amount;
    String customerName;


}

class Order {
    int orderId;
    String productName;
    int quantity;
    String customerName;
}

public class Assignment4 {

public static void main(String[] args) {
	
	Product product = new Product();
    product.productName = "Laptop";
    product.price = 800002.0;
    product.category = "Electronics";

    Inventory inventory = new Inventory();
    inventory.productName = "Laptop";
    inventory.quantity = 10;
    inventory.location = "Warehouse A";

    Sales sales = new Sales();
    sales.productName = "Laptop";
    sales.amount = 80000.0;
    sales.customerName = "Rajesh";

    Order order = new Order();
    order.orderId = 1;
    order.productName = "Laptop";
    order.quantity = 2;
    order.customerName = "Ankith";
    
    System.out.println("****Inventory Details****");
	System.out.println(inventory.productName +" "+
    inventory.quantity +" "+
    inventory.location 
);
	System.out.println("****Sales Details****");
	System.out.println(sales.productName + " "+
    sales.amount + " "+
    sales.customerName 
);
	System.out.println("****Orders Details****");
	System.out.println(order.orderId + " "+
    order.productName + " "+
    order.quantity + " "+
    order.customerName );
	
	
}

}