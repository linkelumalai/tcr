package learn.lamdaexpression;

public class LamdaLexical {

	public static void main(String[] args) {
		String input = "Lucky";
		
//		input ="test"; // this not implicitly final
		Printer printer = input1 -> System.out.println("hellow"+input1+input);
	}
}

@FunctionalInterface
interface Printer {
	void printer(String input);
}