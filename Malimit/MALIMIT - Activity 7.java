import java.util.ArrayList;
import java.util.Scanner;

class ArrayListMinMax {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = 0, max = 0, min = 0;

		ArrayList<Integer> nums = new ArrayList<Integer>();

		System.out.print("Enter the size of the array: ");
		size = input.nextInt();

		System.out.println("Enter "+size+" integers.");
		for(int i = 0; i < size; i++) nums.add(input.nextInt());

		max = min = nums.get(0);
		for(int i = 0; i < size; i++) {
			if(nums.get(i) > max) max = nums.get(i);
			if(nums.get(i) < min) min = nums.get(i);
		}

		System.out.println("Largest element: "+max+" Smallest element: "+min);
	}
}