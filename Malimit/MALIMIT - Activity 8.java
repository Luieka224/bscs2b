import java.util.Scanner;

class JavaScav{
	static Scanner dataIn = new Scanner(System.in);
	public static void main(String[]args) {
		System.out.print("user@root ~/ ");
		String input = dataIn.next();

		switch (input) {
			case "terminate": terminate(); break;
			case "help": help(); break;
			case "suffcomp": suffComp(); break;
			case "floor": floor(); break;
			case "isDigit": isDigit(); break;
			case "toHex": toHex(); break;
			default: invalid(input);
		}
	}
	
	static void help() {
		System.out.println(
			"help\t\t\tDisplays all help commands"+"\n"+
			"suffcomp\t\tCompare a string if it matches with a suffix"+"\n"+
			"terminate\t\tUsed to terminate JavaVM"+"\n"+
			"isDigit\t\t\tIdentify if character is digit"+"\n"+
			"floor\t\t\tFloors the value of a double"+"\n"+
			"toHex\t\t\tConverts the integer to a hex string"+"\n"
		);
		main(null);
	}
	static void invalid(String input) {
		System.out.println(
			"Keyword \""+input+"\" is not recognized as a valid command. Please check your spelling or type help to show commands."
		);
		main(null);
	}

	static void suffComp() {
		System.out.println(
			"\nClass: String \n" +
			"Method Declaration: public static boolean compareSuffix( String input, String suffix ) \n" +
			"Sample Usage: \n" +
			"boolean endsWith = input.endsWith(suffix) \n" +
			"return endsWith; \n" +
			"Try it below. \n"
		);

		System.out.print("Enter string: ");
		String str = dataIn.next();
		System.out.print("Enter suffix: ");
		String suff = dataIn.next();

		System.out.println(str.endsWith(suff));
		main(null);
	}

	private static void toHex() {
		System.out.println(
			"\nClass: Integer \n" +
			"Method Declaration: public static String compareSuffix( int input ) \n" +
			"Sample Usage: \n" +
			"String hex = Integer.toHexString(input) \n" +
			"return hex; \n" +
			"Try it below. \n"
		);

		System.out.print("Enter integer: ");
		int num = dataIn.nextInt();
		System.out.println(Integer.toHexString(num));
		main(null);
	}

	static void terminate() {
		System.out.println(
			"\nClass: System \n" +
			"Method Declaration: public static void terminateProgram() \n" +
			"Sample Usage: \n" +
			"System.exit(0); \n" +
			"System will exit after 5 seconds. \n"
		);

		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}

		System.exit(0);
	}

	static void floor() {
		System.out.println(
			"\nClass: Math \n" +
			"Method Declaration: public static int getFloor( double doubleNum ) \n" +
			"Sample Usage: \n" +
			"int number = Math.floor(doubleNum) \n" +
			"return number; \n" +
			"Try it below. \n"
		);

		System.out.print("Enter double: ");
		double doubleNum = dataIn.nextDouble();
		System.out.println(Math.floor(doubleNum));
		main(null);
	}

	private static void isDigit() {
		System.out.println(
			"\nClass: Character \n" +
			"Method Declaration: public static boolean isDigit( char character ) \n" +
			"Sample Usage: \n" +
			"boolean isDigit =  Character.isDigit(character);\n" +
			"return isDigit; \n" +
			"Try it below. \n"
		);

		System.out.print("Enter character: ");
		char character = dataIn.next().charAt(0);
		System.out.println(Character.isDigit(character));
		main(null);
	}
}