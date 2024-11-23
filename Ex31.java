package selectionStructures;

import java.util.Arrays;
import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {

		int numbers[] = new int[3];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < numbers.length; i++) {

			System.out.println("Input: ");

			numbers[i] = scan.nextInt();

		}

		scan.close();

		// unsorted array

		System.out.print("Unsorted Array: ");

		for (int i = 0; i < numbers.length; i++) {

			System.out.print(numbers[i] + " ");

		}

		System.out.println();

		// sorted array

		Arrays.sort(numbers);

		System.out.print("Sorted Array: ");

		for (int i = 0; i < numbers.length; i++) {

			System.out.print(numbers[i] + " ");

		}

	}

}
