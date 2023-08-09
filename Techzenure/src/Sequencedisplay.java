
public class Sequencedisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int start = 1;      // Starting value of the sequence
		        int step = 3;       // Step size to generate the next elements
		        int elements = 15;  // Number of elements to display

		        System.out.println("The first " + elements + " elements of the sequence:");
		        displaySequence(start, step, elements);
		    }

		    // Method to display the first 'n' elements of the sequence
		    public static void displaySequence(int start, int step, int n) {
		        int currentElement = start;
		        for (int i = 1; i <= n; i++) {
		            System.out.print(currentElement + " ");
		            currentElement += step;
		        }
		    }

	}


