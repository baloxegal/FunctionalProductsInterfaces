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
		List<Product> listProducts = new ArrayList<Product>(Arrays.asList(new Product("Health", "Massager", 40.23f, 3), new Product("Food", "Apple", 1.46f, 42),
				new Product("Second Hand", "Socks", 10.11f, 1), new Product("Health", "Cream", 4.00f, 23), new Product("Gadgets", "Headphones", 20.50f, 14)));
		
		VATFunction productCalculateVAT = p -> {p.setPrice(p.getPrice() * 1.18f);return p;};
		IsHealthPredicate productHealth = p -> {if(p.getCategory().equals("Health")) return true; return false;};
		IsSHPredicate productSH = p -> {if(p.getCategory().equals("Second Hand")) return true; return false;};
		ConsolePrintConsumer print = p -> System.out.println(p);
		
		listProducts.forEach(p -> print.consume(p));
		System.out.println();
		listProducts.stream().forEach(p -> {if(!productHealth.test(p) && !productSH.test(p)) productCalculateVAT.calculate(p); print.consume(p);});
	}
}
