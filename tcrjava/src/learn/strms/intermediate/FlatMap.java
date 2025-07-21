package learn.strms.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args) {

		String[] input = { "leo", "lucky" };

		Stream<String> words = Arrays.stream(input);

		/*
		 * flatMap is used to handle the scenario where you have a stream of elements,
		 * and each element contains multiple sub-element or has a one-to-many mapping.
		 * the primary purpose of the flatMap flatten the stream of element into single
		 * stream.
		 * -----------------------------------------------------------------------------
		 * flatMap is the combination of a map and a flat operation i.e it apply map
		 * function to element as well as flatten them.
		 */
		words.map(word -> word.split("")).flatMap(Arrays::stream).forEach(System.out::println);

		List<Person> persons = Arrays.asList(new Person("bob", Arrays.asList("123", "23232")),
				new Person("test", Arrays.asList("2121", "323232", "2323")));
		FlatMapExmpale fm = new FlatMapExmpale(persons);
		fm.test();
	}
}

// another exmaple
class Person {

	private String name;

	private List<String> phoneNumber;

	public Person(String name, List<String> phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public List<String> getPhoneNumber() {
		return phoneNumber;
	}
}

class FlatMapExmpale {

	private List<Person> persons;

	public FlatMapExmpale(List<Person> persons) {
		this.persons = persons;
	}

	public void test() {
		
		// by using map
		List<List<String>> mapResult = persons.stream().map(Person::getPhoneNumber).collect(Collectors.toList());
		System.out.println(mapResult);

		// by using flatMap

		List<String> flatMapResult = persons.stream().flatMap(person -> person.getPhoneNumber().stream())
				.collect(Collectors.toList());

		System.out.println(flatMapResult);
	}

}
