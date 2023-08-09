package com.techzenure.java.oops;

public class Inventory{

	public static void main(String[] args) {
     Product prod = new Product();
		
		System.out.println(prod.getProductId() + " | " + prod.getProductName() + " | " + prod.getProductPrice());
		
		prod.setProductId(524163);
		prod.setProductName("Laptop");
		prod.setProductPrice(65750.5f);
		
		System.out.println(prod.getProductId() + " | " + prod.getProductName() + " | " + prod.getProductPrice());
		System.out.println();
		
		System.out.println("prod instance of ---> " + prod.getClass().getName());
		System.out.println("prod instance of ---> " + prod.getClass().getSimpleName());
		
		System.out.println("hashCode() ---> " + prod.hashCode());
		System.out.println("hashCode() in Hexa Decimal form ---> " + Integer.toHexString(prod.hashCode()));
		System.out.println();
		
		System.out.println(prod); //toString()
		
		System.out.println("prod instanceof Product ---> " + (prod instanceof Product)); //true
		System.out.println("prod instanceof Object ---> " + (prod instanceof Object)); //true		
	}

}
		

	}

}
