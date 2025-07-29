package learn.enum_;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetDemo {

	public static void main(String[] args) {
		EnumSet<Priority> allPriorities = EnumSet.allOf(Priority.class);

		for (Priority priority : allPriorities) {
			System.out.println(priority);
		}

		EnumSet<Priority> somePriorities = EnumSet.of(Priority.HIGH, Priority.LOW);

		for (Priority priority : somePriorities) {
			System.out.println(priority);
		}

		EnumSet<Grade> grades = EnumSet.range(Grade.A, Grade.D);

		for (Grade grade : grades) {
			System.out.println(grade);
		}

		EnumSet<Grade> otherGrades = EnumSet.complementOf(grades);
		for (Grade grade : otherGrades) {
			System.out.println("complement--" + grade);
		}
	}
}
