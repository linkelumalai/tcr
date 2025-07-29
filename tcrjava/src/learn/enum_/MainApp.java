package learn.enum_;

public class MainApp {

	public static void main(String[] args) {

		for (Priority priority : Priority.values()) {
			String name = priority.name();
			int oridianl = priority.ordinal();
			System.out.println(name + "(" + oridianl + ")");
		}

		// reverse lookup
		Priority low = Priority.valueOf("LOW");
		System.out.println(low);
		Priority high = Priority.values()[2];
		System.out.println(high);
	}

}
