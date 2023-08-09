import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();
		        scanner.close();

		        int reversedNumber = reverseNumber(number);
		        System.out.println("Reversed number: " + reversedNumber);
		    }

		    // Method to reverse a number
		    public static int reverseNumber(int number) {
		        int reversedNumber = 0;

		        while (number != 0) {
		            int digit = number % 10; // Extract the last digit
		            reversedNumber = reversedNumber * 10 + digit; // Add the digit to the reversed number
		            number /= 10; // Remove the last digit from the original number
		        }

		        return reversedNumber;
		    }
		

	}


