                import java.util.Scanner;

                public class EvenNumbersBetweenRange {

	            public static void main(String[] args) {
		        // TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the first number: ");
		        int x = scanner.nextInt();

		        System.out.print("Enter the last number: ");
		        int y = scanner.nextInt();

		        if (x >= y) {
		            System.out.println("ERROR: Invalid Input - second number should be greater than the first number");
		        } else {
		            System.out.println("Even Numbers between " + x + " and " + y + " are");
		            displayEvenNumbersBetweenRange(x, y);
		        }

		        scanner.close();
		    }

		        // Method to display even numbers between x and y (inclusive)
		         public static void displayEvenNumbersBetweenRange(int x, int y) {
		         int start = (x % 2 == 0) ? x : x + 1;

		         for (int i = start; i <= y; i += 2) {
		            System.out.print(i + " ");
		        }
		         System.out.println();
		    }
		}

	


