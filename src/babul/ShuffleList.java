package babul;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ShuffleList {

	public static void main(String[] args) {

		int size, i = 0, j = 0, increment;
		List<Integer> list = new LinkedList<>();
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the size of List: ");
			size = scanner.nextInt();

			for (increment = 0; increment < size; increment++) {
				System.out.println("Enter a digit to ArrayList: ");
				Integer input = scanner.nextInt();
				list.add(input);
				System.out.println(list);
			}

			System.out.println("Entered list is:  " + list);
			i = size - 1;
			List<Integer> list2 = new LinkedList<>();
			for (increment = 0; increment < size; increment++) {
				if (i >= (size / 2)) {
					newList(list2, list.get(i));
					i--;
				}
				if (j < (size / 2)) {
					newList(list2, list.get(j));
					j++;
				}
			}
			System.out.println("Shuffled list is:  " + list2);

		}
	}

	private static void newList(List<Integer> newList, Integer values) {
		newList.add(values);
	}

}
