package learn.predefinedutilsfunction;

import java.util.List;
import java.util.function.Consumer;

// only consume not return
public class ConsumerDemo {

	public static void main(String[] args) {

		Consumer<String> convertAndDisplay = input -> System.out.println(input.toUpperCase());
		convertAndDisplay.accept("lucky");

		Consumer<Integer> sq = input -> System.out.println(input * input);
		List<Integer> li = List.of(1, 4, 5, 8);
		li.forEach(sq);

		Consumer<String> appendInput = input -> System.out.println("Hey there ! how are you " + input);
		appendInput.andThen(convertAndDisplay).accept("lucky");
	}
}
