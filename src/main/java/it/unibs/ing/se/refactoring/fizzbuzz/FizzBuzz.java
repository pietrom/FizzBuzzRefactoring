package it.unibs.ing.se.refactoring.fizzbuzz;

public class FizzBuzz {
	public static String play(int input) {
		String result = null;
		if (isMultipleOf(input, 15)) {
			result = "fizzbuzz";
		} else if (isMultipleOf(input, 3)) {
			result = "fizz";
		} else if (isMultipleOf(input, 5)) {
			result = "buzz";
		}
		if (hasNoValue(result)) {
			result = Integer.toString(input);
		}
		return result;
	}

	private static boolean hasNoValue(String result) {
		return result == null;
	}

	private static boolean isMultipleOf(int input, int divider) {
		return input % divider == 0;
	}
}
