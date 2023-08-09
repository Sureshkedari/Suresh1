
public class Arithmeticoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 3;
		
		System.out.println(x + y); //13
		System.out.println(x - y); //7
		System.out.println(x * y); //30		
		System.out.println(x / y); //3 
		System.out.println(10.0f / 3); //3.3333333
		System.out.println(10.0 / 3); //3.3333333333333335
		
		System.out.println(10 % 3); //1
		System.out.println(-10 % 3); //-1
		System.out.println(10 % -3); //1
		System.out.println(-10 % -3); //-1		
		
		//System.out.println(10 / 0); //java.lang.ArithmeticException
		System.out.println(10.0f / 0); //Infinity
		System.out.println(10.0 / 0); //Infinity
		System.out.println(-10.0f / 0); //-Infinity
		System.out.println(0.0 / 0); //NaN (Not a Number)
	}



	}


