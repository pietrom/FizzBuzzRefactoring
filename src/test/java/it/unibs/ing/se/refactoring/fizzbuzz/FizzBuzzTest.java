package it.unibs.ing.se.refactoring.fizzbuzz;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@RunWith(Parameterized.class)
public class FizzBuzzTest {
	@Parameters(name = "f({0}) = {1}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 1, "1" }, { 2, "2" }, { 3, "fizz" }, { 4, "4" }, { 5, "buzz" },
				{ 15, "fizzbuzz" }, { 6, "fizz" }, { 20, "buzz" }, { 75, "fizzbuzz" }, { 7, "bang" }, { 21, "fizzbang" },
				{ 35, "buzzbang" }, { 105, "fizzbuzzbang" }});
	}

	private int input;
	private String expected;

	public FizzBuzzTest(int input, String expected) {
		this.input = input;
		this.expected = expected;
	}

	@Test
	public void doTest() {
		assertThat(FizzBuzz.play(input), is(equalTo(expected)));
	}
}
