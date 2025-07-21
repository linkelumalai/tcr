package learn.methodref;

public class ObjectMethodRef {

	public static void main(String[] args) {

		ArithmeticPreformance opr = (a, b) -> {
			int sum = a + b;
			System.out.println(sum);
			return sum;
		};

		opr.perform(6, 7);

		ObjectMethodRef obj = new ObjectMethodRef();

		ArithmeticPreformance methodRef = obj::AddtionPrefom;
		System.out.println(methodRef.perform(3, 3));

		ArithmeticPreformance methodRefsub = obj::sub;
		System.out.println(methodRefsub.perform(7, 3));
	}

	public int AddtionPrefom(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public int sub(int a, int b) {
		int sub = a - b;
		return sub;
	}

}
