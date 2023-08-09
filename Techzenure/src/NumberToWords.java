import java.util.Scanner;

public class NumberToWords {

	private static final String[] WORDS = null;
	private static Object Number;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  
		final String[] WORDS = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE" };
		   

		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();
		        scanner.close();
		        System.out.println("Output: " + NumberToWords(Number));
		    }

		    private static String NumberToWords(Object number2) {
		// TODO Auto-generated method stub
		return null;
	}

			// Method to convert a number to words
		    public static String numberToWords(int number) {
		        if (number == 0) {
		            return WORDS[0]; // Special case for zero
		        }

		        StringBuilder result = new StringBuilder();

		        // Extracting each digit from the number and converting it to word
		        while (number > 0) {
		            int digit = number % 10;
		            result.insert(0, WORDS[digit] + " ");
		            number /= 10;
		        }

		        return result.toString().trim();
		    }
		

	}


