package learn.enum_;

public class AdvanceMainEnum {

	public static void main(String[] args) {
		for (AdvanceEnum advanceEnum : AdvanceEnum.values()) {
			String name = advanceEnum.name();
			int oridinal = advanceEnum.ordinal();
			int days = advanceEnum.getEstimatedComplistionDays();
			System.out.println(name + ", " + oridinal + "," + days);
		}
	}
}
