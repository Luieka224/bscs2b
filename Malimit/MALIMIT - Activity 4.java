import java.util.Scanner;

class CelsiusVFarenheit {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print(
            "1. \u00B0C -> \u00B0F" + "\n" +
            "2. \u00B0F -> \u00B0C" + "\n" +
            "Enter choice: "
        );

        int choice = in.nextInt();

        switch(choice) {
            case 1:
            case 2: System.out.println(tempConvert(choice) + (choice == 1 ? "\u00B0F" : "\u00B0C")); break;
            default: main(null);
        }

        in.close();
    }

    static double tempConvert(int choice) {
        System.out.print("Enter temperature: ");
        double temp = in.nextDouble();
        return (choice == 1 ? (temp = (temp *= 1.8) + 32) : (temp = (temp -= 32) * 1.8));
    }
}