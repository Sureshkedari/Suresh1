import java.util.Scanner;

public class Billgeneration {

	public static void main(String[] args) {
		int pizzaUnitPrice = 100;
		int puffUnitPrice = 20;
		int coolDrinkUnitPrice = 10;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the no of pizzas bought: ");
		int pizzaQty = sc.nextInt();
		
		System.out.print("enter the no of puffs bought: ");
		int puffQty = sc.nextInt();
		
		System.out.print("enter the no of cool drink's bought: ");
		int coolDrinkQty = sc.nextInt();
		System.out.println();
		
		float pizzaCost = pizzaUnitPrice * pizzaQty;
		float puffCost = puffUnitPrice * puffQty;
		float coolDrinkCost = coolDrinkUnitPrice * coolDrinkQty;
		
		float totalCost = pizzaCost + puffCost + coolDrinkCost;
		System.out.println();
		
		System.out.println("\t\t BILL DETAILS\n");
		System.out.printf("No of Pizzas     : %d \t Cost: %.2f \n", pizzaQty , pizzaCost);
		System.out.printf("No of Puffs      : %d \t Cost: %.2f \n", puffQty , puffCost);
		System.out.printf("No of Cool Drinks: %d \t Cost: %.2f \n", coolDrinkQty , coolDrinkCost);
		System.out.println();
		
		System.out.printf("Total Price: %.2f\n" , totalCost);
		System.out.println("ENJOY THE SHOW!!!");
	}

	}

