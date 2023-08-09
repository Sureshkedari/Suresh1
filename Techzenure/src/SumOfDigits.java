import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();
		        scanner.close();

		        int sum = sumOfDigits(number);
		        System.out.println("Sum of digits of " + number + " = " + sum);
		    }

		    // Method to find the sum of digits of a number
		    public static int sumOfDigits(int number) {
		        int sum = 0;

		        while (number != 0) {
		            int digit = number % 10; // Extract the last digit
		            sum += digit; // Add the digit to the sum
		            number /= 10; // Remove the last digit from the original number
		        }

		        return sum;
		    }

	}

