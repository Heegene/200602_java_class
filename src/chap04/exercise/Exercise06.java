package chap04.exercise;

public class Exercise06 {
	public static void main(String[] args) {

		for (int line = 0; line < 5; line++) {
			for (int star = 0; line >= star; star++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}
}
