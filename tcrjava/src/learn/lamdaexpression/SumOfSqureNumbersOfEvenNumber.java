package learn.lamdaexpression;

import java.util.Arrays;
import java.util.List;

public class SumOfSqureNumbersOfEvenNumber {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		long sum = numbers.stream().filter(n-> n%2==0).mapToLong( n -> n* n).sum();
		
		System.out.println(sum);
		
	}
}
