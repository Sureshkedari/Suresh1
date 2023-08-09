import java.util.Scanner;

public class MultiplicationTable1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	      System.out.print("Enter the number for the multiplication table : ");
	        int number = scanner.nextInt();

	        System.out.println("Multiplication Table of " + number + " :");

	        for (int i = 1; i <= 10; i++) {
	            System.out.println(number + " x " + i + " = " + (number * i));
	            
	        }

	        scanner.close();
	}
}
	   			

