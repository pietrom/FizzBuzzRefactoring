package it.unibs.ing.se.refactoring.fizzbuzz;

public class FizzBuzz {
	public static String play(int input) {
		if(isMultipleOf(input, 15)) {
			return "fizzbuzz";
		}
		if(isMultipleOf(input, 3)) {
			return "fizz";
		}
		if(isMultipleOf(input, 5)) {
			return "buzz";
		}
		return Integer.toString(input);
	}

	private static boolean isMultipleOf(int input, int divider) {
		return input % divider == 0;
	}
}
