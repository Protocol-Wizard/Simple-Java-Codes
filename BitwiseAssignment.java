public class BitwiseAssignment{
	public static void main(String[] args){
		int num1 = 7;
		int num2 = -8;
		System.out.println("7's bitwise compliment is: "+~num1);
		System.out.println("-8's bitwise compliment is: "+~num2);
		int num3 = 10;
		num3 += 20;
		System.out.println("10 + 20 is: "+num3);
		num3 -= 5;
		System.out.println("30 - 5 is: "+num3);
		num3 *= 5;
		System.out.println("25 * 5 is: "+num3);
		num3 /= 5;
		System.out.println("125 / 5 is: "+num3);
		num3 %= 5;
		System.out.println("10 % 5 is: "+num3);
}
}