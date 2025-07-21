package learn.lamdaexpression;

public class ThisDemoLamdaExpression {

	public static void main(String[] args) {
		ThisDemoLamdaExpression demo = new ThisDemoLamdaExpression();
		Printer printLam = demo.getLamda();
		printLam.printer("Lamda Expression");
		Printer printano = demo.getAnonymous();
		printano.printer("Anonymous Expression");

	}

	public Printer getLamda() {
		Printer print = (input) -> System.out.println(input + " : " + this.getClass());
		return print;
	}

	public Printer getAnonymous() {
		Printer print = new Printer() {

			@Override
			public void printer(String input) {
				System.out.println(input + " : " + this.getClass());
			}
		};

		return print;
	}
}
