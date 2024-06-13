/**Write a Java programming to create a e-commerce system with three classes product customer
 *  and order, online product and physical product are implementation of Product interface. 
 *  procuct intrface has list of product as method for adding them. Product should be the iterface 
 *  with methods show product, addproduct, delete product, and claculate product prize**/
package com.demo;

import java.util.ArrayList;
import java.util.List;

//Interface representing a product
interface Product {
 void showProduct(); // Method to display products
 void addProduct(String productName, double price); // Method to add a product
 void deleteProduct(String productName); // Method to delete a product
 double calculateProductPrice(); // Method to calculate the total price of products
}

//Class representing online products
class OnlineProduct implements Product {
 private List<String> products; // List to store product names
 private List<Double> prices; // List to store product prices

 public OnlineProduct() {
     products = new ArrayList<>();
     prices = new ArrayList<>();
 }


 public void showProduct() {
     for (int i = 0; i < products.size(); i++) {
         System.out.println("Product: " + products.get(i) + ", Price: rs" + prices.get(i));
     }
 }

 
 public void addProduct(String productName, double price) {
     products.add(productName);
     prices.add(price);
 }


 public void deleteProduct(String productName) {
     int index = products.indexOf(productName);
     if (index != -1) {
         products.remove(index);
         prices.remove(index);
     } else {
         System.out.println("Product not found!");
     }
 }

 
 public double calculateProductPrice() {
     double total = 0;
     for (Double price : prices) {
         total += price;
     }
     return total;
 }
}

//Class representing physical products
class PhysicalProduct implements Product {
 private List<String> products; // List to store product names
 private List<Double> prices; // List to store product prices

 public PhysicalProduct() {
     products = new ArrayList<>();
     prices = new ArrayList<>();
 }


 public void showProduct() {
     for (int i = 0; i < products.size(); i++) {
         System.out.println("Product: " + products.get(i) + ", Price: rs " + prices.get(i));
     }
 }

 
 public void addProduct(String productName, double price) {
     products.add(productName);
     prices.add(price);
 }

 
 public void deleteProduct(String productName) {
     int index = products.indexOf(productName);
     if (index != -1) {
         products.remove(index);
         prices.remove(index);
     } else {
         System.out.println("Product not found!");
     }
 }

 
 public double calculateProductPrice() {
     double total = 0;
     for (Double price : prices) {
         total += price;
     }
     return total;
 }
}

//Class representing an order
class Order {
 private Product product; // Product associated with the order

 public Order(Product product) {
     this.product = product;
 }

 public void showProducts() {
     product.showProduct();
 }

 public double calculateTotal() {
     return product.calculateProductPrice();
 }
}

//Main class to test the program
public class Main5 
{
	public static void main(String[] args) {
	     // Online Products
	     Product onlineProduct = new OnlineProduct();
	     onlineProduct.addProduct("Laptop", 99999.99);
	     onlineProduct.addProduct("Phone", 59099.99);
	     onlineProduct.showProduct();
	     System.out.println("Total price for online products: rs " + onlineProduct.calculateProductPrice());

	     // Physical Products
	     Product physicalProduct = new PhysicalProduct();
	     physicalProduct.addProduct("Book", 200.99);
	     physicalProduct.addProduct("Clothing", 4999.99);
	     physicalProduct.showProduct();
	     System.out.println("Total price for physical products: rs " + physicalProduct.calculateProductPrice());

	     // Orders
	     Order onlineOrder = new Order(onlineProduct);
	     System.out.println("Total price for online order: rs " + onlineOrder.calculateTotal());

	     Order physicalOrder = new Order(physicalProduct);
	     System.out.println("Total price for physical order: rs " + physicalOrder.calculateTotal());
	 }
	}




	/** 
	 * 
	 * DRY RUN 
	 * 
	 * Product: Laptop, Price: rs99999.99
	Product: Phone, Price: rs59099.99
	Total price for online products: rs 159099.98

	Product: Book, Price: rs 200.99
	Product: Clothing, Price: rs 4999.99
	Total price for physical products: rs 5200.98

	Total price for online order: rs 159099.98
	Total price for physical order: rs 5200.98

	 *
	 */




