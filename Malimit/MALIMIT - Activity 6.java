import java.util.Scanner;

class ArrayMinMax {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int arr[] = new int[10], min, max;
	
		System.out.println("Enter 10 numbers: ");
		for(int i = 0;i<arr.length;i++) arr[i] = input.nextInt();

		max = min = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
		}

		System.out.println("Max number is "+max+" while min number is "+min);
	}
}