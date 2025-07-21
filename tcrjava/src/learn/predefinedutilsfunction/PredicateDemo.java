package learn.predefinedutilsfunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<Integer> isEven = (num) -> num % 2 == 0;
		System.out.println(isEven.test(20));
		System.out.println(isEven.test(13));

		Predicate<Integer> isGreaterThan50 = num -> num > 50;
		System.out.println(isGreaterThan50.test(60));
		System.out.println(isGreaterThan50.test(51));

		// to check the both are contidon

		System.out.println(isEven.and(isGreaterThan50).test(62));

		System.out.println(isEven.and(isGreaterThan50).test(63));

		System.out.println(isEven.negate().test(63)); // true

		Predicate<Integer> isOdd = Predicate.not(isEven); // this is static method
		System.out.println(isOdd.test(3)); // true

		Predicate<String> checkEquality = Predicate.isEqual("Ling");
		System.out.println(checkEquality.test("Ling "));

		// real life scenario

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		nums.stream().filter(isEven).forEach(System.out::println);

	}
}
