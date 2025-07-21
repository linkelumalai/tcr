package learn.predefinedutilsfunction;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierDemo {

	// there is no static and default method of interface
	public static void main(String[] args) {

		Supplier<Integer> getCurrentMonthValue = () -> LocalDate.now().getMonthValue();

		System.out.println(getCurrentMonthValue.get());

		Supplier<Integer> getCurrentDayOfMonthValue = () -> LocalDate.now().getDayOfMonth();

		System.out.println(getCurrentDayOfMonthValue.get());

		Supplier<String> getCurrentDayNamu = () -> LocalDate.now().getDayOfWeek().name();

		System.out.println(getCurrentDayNamu.get());
	}
}
