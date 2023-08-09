import java.util.Scanner;
public class MultiplexTheater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		     Scanner scanner = new Scanner(System.in);

		      System.out.print("Enter the no of tickets: ");
		      int numTickets = scanner.nextInt();

		      if (numTickets < 5 || numTickets > 40) {
		      System.out.println("Minimum of 5 and Maximum of 40 Tickets");
		      } 
		      else {
		      System.out.print("Do you want refreshment (Y/N): ");
		      char refreshmentChoice = scanner.next().charAt(0);

		      System.out.print("Do you have coupon code (Y/N): ");
		      char couponChoice = scanner.next().charAt(0);

		      System.out.print("Enter the circle (K/Q): ");
		      char circle = scanner.next().charAt(0);

		      double ticketCost = calculateTicketCost(numTickets, refreshmentChoice, couponChoice, circle);
		      System.out.println("Ticket cost: " + String.format("%.2f", ticketCost));
		      }

		      scanner.close();
		      }

		      public static double calculateTicketCost(int numTickets, char refreshmentChoice, char couponChoice, char circle) {
		      int ticketCost = 0;
		      int kingTicketPrice = 75;
		      int queenTicketPrice = 150;
		      int refreshmentPrice = 50;

		      if (circle == 'K') {
		      ticketCost = numTickets * kingTicketPrice;
		  } 
		      else if (circle == 'Q') {
		      ticketCost = numTickets * queenTicketPrice;
		        } 
		      else {
		      System.out.println("Invalid Input");
		      System.exit(0);
		   }

		      if (numTickets > 20) {
		      ticketCost *= 0.9; // Apply 10% discount for bulk booking
		        }

		      if (refreshmentChoice == 'Y') {
		      ticketCost += numTickets * refreshmentPrice;
		        }

		      if (couponChoice == 'Y') {
		      ticketCost *= 0.98; // Apply 2% discount if coupon code is used
		        }

		      return ticketCost;
		    }
		}
