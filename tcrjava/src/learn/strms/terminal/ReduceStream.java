package learn.strms.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReduceStream {

	public static void main(String[] args) {
		int add = Stream.iterate(1, n -> n + 1).skip(5).limit(5).reduce(0, (a, b) -> a + b);
		System.out.println(add);

		long product = Stream.iterate(1, n -> n + 1).limit(5).reduce(1, (a, b) -> a * b);
		System.out.println(product);

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println(sum);
	}
}
