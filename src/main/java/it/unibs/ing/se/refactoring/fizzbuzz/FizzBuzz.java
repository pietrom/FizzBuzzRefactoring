package it.unibs.ing.se.refactoring.fizzbuzz;

public class FizzBuzz {
	private static final String Empty = "";
	
	public static String play(int input) {
		String result = Empty;
		if (isMultipleOf(input, 3)) {
			result += "fizz";
		}
		if (isMultipleOf(input, 5)) {
			result += "buzz";
		}
		if (hasNoValue(result)) {
			result = Integer.toString(input);
		}
		return result;
	}

	private static boolean hasNoValue(String result) {
		return Empty.equals(result);
	}

	private static boolean isMultipleOf(int input, int divider) {
		return input % divider == 0;
	}
}
