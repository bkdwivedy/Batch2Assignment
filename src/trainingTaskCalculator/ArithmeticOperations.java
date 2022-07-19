package trainingTaskCalculator;

public class ArithmeticOperations implements Calculator {

	public int addition(int input1, int input2) {
		return input1 + input2;
	}

	public int substraction(int input1, int input2) {
		return input1 - input2;
	}

	public int multiplication(int input1, int input2) {
		return input1 * input2;
	}

	public int division(int input1, int input2) {
		return input1 / input2;
	}

	public int modules(int input1, int input2) {
		return input1 % input2;
	}

	public int percentage(int input1, int input2) {
		return ((input1 * input2) / 100);
	}

}
