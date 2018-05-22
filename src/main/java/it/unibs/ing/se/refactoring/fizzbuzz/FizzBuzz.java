package it.unibs.ing.se.refactoring.fizzbuzz;

public class FizzBuzz {
	public static String play(int input) {
		if(input % 15 == 0) {
			return "fizzbuzz";
		}
		if(input % 3 == 0) {
			return "fizz";
		}
		if(input % 5 == 0) {
			return "buzz";
		}
		return Integer.toString(input);
	}
}
