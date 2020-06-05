package chap04.lecture;

import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args) {
		int n = (int) (Math.random() * 100) + 1;
		Scanner s = new Scanner(System.in);
		int user = 0;
		while (n != user) {

			user = s.nextInt();

			if (user < n) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (user > n) {
				System.out.println("더 작은 수를 입력하세요.");
			}
		}
		System.out.println("맞았습니다.");

	}
}
