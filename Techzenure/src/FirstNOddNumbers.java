import java.util.Scanner;

public class FirstNOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter how many odd numbers to be generated: ");
		        int n = scanner.nextInt();
		        scanner.close();

		        System.out.print("Exp O/P: ");
		        displayFirstNOddNumbers(n);
		    }

		    // Method to display the first 'n' odd numbers
		    public static void displayFirstNOddNumbers(int n) {
		        int count = 0;
		        int num = 1;

		        while (count < n) {
		            System.out.print(num + " ");
		            num += 2; // Increment by 2 to get the next odd number
		            count++;
		        }

		        System.out.println();
		    }
	

	}


