import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first number: ");
		float num1 = s.nextFloat();
		System.out.print("Enter second number: ");
		float num2 = s.nextFloat();
		float num3 = num1+num2;
		System.out.println("Sum: "+(num3));
		System.out.println("Product: "+(num1*num2));
		System.out.println("Division: "+(num1/num2));
		System.out.println("Subtraction: "+(num1-num2));
		System.out.println("Remainder: "+(num1%num2));
	}
}
