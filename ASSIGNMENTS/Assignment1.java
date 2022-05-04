package assignments;

// Assignment1: WAP in java to perform all the Arithmetic operations(+,-,*,/)

public class Assignment1 {

	public static void main(String[] args) {
		
		int a=41, b=23, add, sub, mul, div, rem;
		add = a+b;
		sub = a-b;
		mul = a*b;
		div = a/b;
		rem = a%b;
		
		System.out.println("a = " + a + " and b = " + b);
		System.out.println("a + b = " + add);
		System.out.println("a - b = " + sub);
		System.out.println("a * b = " + mul);
		System.out.println("a / b = " + div);
		System.out.println("a % b = " + rem);
	}
}
