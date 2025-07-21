package tcrjava.leetcode.string;

import java.util.concurrent.atomic.AtomicInteger;

public class MultiplyString {

	public static void main(String[] args) {

//		try (Scanner sc = new Scanner(System.in)) {
//			String a = sc.nextLine();
//			String b = sc.nextLine();
//			product(a, b);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		System.out.println(product("10", "3"));

	}

	public static String product(String a, String b) {
		int data = stringToIntgerConversion(a) * stringToIntgerConversion(b);
		return String.valueOf(data);
	}

	public static int stringToIntgerConversion(String input) {

		return input.chars().map(ch -> {
			return ch - '0';
		}).reduce(0, (acc, digit) -> acc * 10 + digit);

	}
}
