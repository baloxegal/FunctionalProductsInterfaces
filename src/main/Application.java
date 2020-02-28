package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dataProducts.Product;

//Varianta cu return obiect Product

@FunctionalInterface
interface VATFunction 
{ 
    Product calculate(Product product); 
}

//Varianta fara return obiect Product

//@FunctionalInterface
//interface VATFunction 
//{ 
//    void calculate(Product product); 
//}

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
		
		// Varianta cu return obiect Product
		
		VATFunction productCalculateVAT = p -> {
			Product pClone = null;
			try {
				pClone = p.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pClone.setPrice(p.getPrice() * 1.18f);
			return pClone;
		};
		
		// Varianta fara return obiect Product
		
		//VATFunction productCalculateVAT = p -> p.setPrice(p.getPrice() * 1.18f); 
		
		System.out.println(listProducts.get(0));
		System.out.println(productCalculateVAT.calculate(listProducts.get(0)));
	}
}
