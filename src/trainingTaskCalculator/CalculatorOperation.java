package trainingTaskCalculator;

import java.util.Scanner;

public class CalculatorOperation {
	public static void main(String[] args) {
		ArithmeticOperations calculator = new ArithmeticOperations();
		Scanner scanner = new Scanner(System.in);
		int input1,input2;
		
		while (true) {
			System.out.println("\nPress 1 for Addition");
			System.out.println("Press 2 for Substraction");
			System.out.println("Press 3 for Multiplication");
			System.out.println("Press 4 for Division");
			System.out.println("Press 5 for Modulus(%)");
			System.out.println("Press 6 for Percentage");
			System.out.println("Press 0 for Exit\n");
			int choice = scanner.nextInt();
			System.out.println("Enter the First Number");
			input1 = scanner.nextInt();
			System.out.println("Enter the Second Number");
			input2 = scanner.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Addiion = " + calculator.addition(input1, input2));
				break;
			case 2:
				System.out.println("Subtraction = " + calculator.substraction(input1, input2));
				break;
			case 3:
				System.out.println("Multiplication = " + calculator.multiplication(input1, input2));
				break;
			case 4:
				System.out.println("Division = " + calculator.division(input1, input2));
				break;
			case 5:
				System.out.println("Modulus(%) = " + calculator.modules(input1, input2));
				break;
			case 6:
				System.out.println("Percentage = " + calculator.percentage(input1, input2));
				break;
			case 0:
				System.out.println("Exit | Thank You");
				System.exit(choice);
			default:
				System.out.println("Please Choose Correct Option:");
				break;
			}
		}
	}
}