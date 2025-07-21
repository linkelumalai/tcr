package learn.strms.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByMethod {

	public static void main(String[] args) {

		List<Product> products = Arrays.asList(new Product("Apple", 117000.00), new Product("Samsung", 117000.00),
				new Product("one plus", 24000.00), new Product("moto", 30000.00), new Product("nothing", 20000.00));

		Map<Double, List<Product>> groupingByPrice = products.stream()
				.collect(Collectors.groupingBy(Product::getPrice));

		System.out.println(groupingByPrice);

		Map<Boolean, List<Product>> productsPar = products.stream()
				.collect(Collectors.partitioningBy(product -> product.getPrice() < 100000.00));

		System.out.println(productsPar);

	}
}
