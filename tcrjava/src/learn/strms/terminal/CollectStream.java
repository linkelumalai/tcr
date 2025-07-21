package learn.strms.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectStream {

	public static void main(String[] args) {

		List<String> data = Arrays.asList("Ling", "Lucky", "Leo", "test");

		Set<String> newList = data.stream().filter(flt -> flt.startsWith("L"))
				.collect(Collectors.toCollection(TreeSet::new));
		
		newList.forEach(System.out::println);
		
		long count = data.stream().filter(flt -> flt.startsWith("L")).collect(Collectors.counting());
		
		System.out.println(count);
	}
}
