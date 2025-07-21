package learn.lamdaexpression;

import java.util.ArrayList;
import java.util.List;

public class TransformStringUsingLamdaExpression {

	public static void main(String[] args) {

		List<String> words = List.of("ling", "lucky", "leo");
		List<String> result = new ArrayList<>();

		Transfomer trans = (str) -> str.toUpperCase();

		words.stream().forEach(data -> {
			result.add(trans.transform(data));
		});

		System.out.println(result);

	}
}

@FunctionalInterface
interface Transfomer {
	String transform(String str);
}
