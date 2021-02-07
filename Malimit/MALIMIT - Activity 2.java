import java.util.Scanner;

class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 2 numbers separated by a space: ");
		int num1 = input.nextInt(), num2 = input.nextInt();

		System.out.println(
			"Sum is "+(num1+num2)+"\n"+
			"Difference is "+(num1-num2)+"\n"+
			"Product is "+(num1*num2)+"\n"+
			"Quotient is "+(num1/num2)+"\n"+
			"Remainder is "+(num1%num2)+"\n"
		);
	}
}