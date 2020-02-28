package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dataProducts.Product;

@FunctionalInterface
interface VATFunction 
{ 
    Product calculate(Product product); 
}

@FunctionalInterface
interface IsHealthPredicate 
{ 
    Boolean test(Product product); 
} 

@FunctionalInterface
interface IsSHPredicate 
{ 
    Boolean test(Product product); 
}

@FunctionalInterface
interface ConsolePrintConsumer 
{ 
    void consume(Product product); 
} 

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> listProducts = new ArrayList<Product>(Arrays.asList(new Product("Healf", "Massager", 40.23f, 3), new Product("Food", "Apple", 1.46f, 42),
				new Product("Second Hand", "Socks", 10.11f, 1), new Product("Healf", "Cream", 4.00f, 23), new Product("Gadgets", "Headphones", 20.50f, 14)));
	}

}
