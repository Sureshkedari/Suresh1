import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
	    System.out.println("Enter first no : ");
	    		int fno =sc.nextInt();
	    		System.out.println("Enter second no :  ");
	    		int sno =sc.nextInt();
	    		int s = fno + sno ;
	    		System.out.println("sum = "+ s);
		System.out.println(fno + " + " + sno + " = " + s);
	}

}
