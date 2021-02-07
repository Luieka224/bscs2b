class GreatestValue{
	public static void main(String[]args) {
		int number1 = 10, number2 = 23, number3 = 5;
	
		// int greatestValue = (number1 > number2 ? number1 : number2) > number3 ? (number1 > number2 ? number1 : number2) : number3;		

		System.out.println(
			"number 1 = "+number1+"\n"+
			"number 2 = "+number2+"\n"+
			"number 3 = "+number3+"\n"+
			"The highest number is = " + ((number1 > number2 ? number1 : number2) > number3 ? (number1 > number2 ? number1 : number2) : number3)
		);
	}
}

class AverageOfThree{
	public static void main(String[]args) {
		int number1 = 10, number2 = 20, number3 = 45;

		System.out.println(
			"number 1 = "+number1+"\n"+
			"number 2 = "+number2+"\n"+
			"number 3 = "+number3+"\n"+
			"Average is = " + (number1+number2+number3)/3
		);
	}
}

class Variables{
	public static void main(String[]args) {
		int number = 10;
		char letter = 'a';
		boolean result = true;
		String str = "hello";

		System.out.println(
			"Number = "+number+"\n"+
			"letter = "+letter+"\n"+
			"result = "+result+"\n"+
			"str = "+str
		);
	}
}