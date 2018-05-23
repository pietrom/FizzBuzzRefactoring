package it.unibs.ing.se.refactoring.fizzbuzz;

import java.util.Map;
import java.util.TreeMap;

public class FizzBuzz {
	private static final String Empty = "";
	
	private static final Map<Integer, String> cases = new TreeMap<Integer, String>();
	
	static {
		cases.put(3, "fizz");
		cases.put(5, "buzz");
		cases.put(7, "bang");
	}
	
	public static String play(int input) {
		String result = cases.entrySet().stream().reduce(Empty, (acc, curr) -> isMultipleOf(input, curr.getKey()) ? combine(acc, curr.getValue()) : acc, FizzBuzz::combine);		
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
	
	private static String combine(String x, String y) {
		return x + y;
	}
}
