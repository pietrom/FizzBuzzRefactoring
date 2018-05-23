package it.unibs.ing.se.refactoring.fizzbuzz;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class FizzBuzz {
	private static final Map<Integer, String> cases = new TreeMap<Integer, String>();

	static {
		cases.put(3, "fizz");
		cases.put(5, "buzz");
		cases.put(7, "bang");
	}

	public static String play(int input) {
		StringBuilder buffer = new StringBuilder();
		for (Entry<Integer, String> c : cases.entrySet()) {
			if (isMultipleOf(input, c.getKey())) {
				buffer.append(c.getValue());
			}
		}
		return buffer.length() == 0 ? Integer.toString(input) : buffer.toString();
	}

	private static boolean isMultipleOf(int input, int divider) {
		return input % divider == 0;
	}
}
