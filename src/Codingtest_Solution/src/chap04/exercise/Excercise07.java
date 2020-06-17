package chap04.exercise;

import java.util.Scanner;

public class Excercise07 {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int balance = 0;

		int keyCode = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			if (keyCode != 13 && keyCode != 10) {

				System.out.println("--------------------");
				System.out.println(" 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
				System.out.println("----------------------------");
				System.out.println("선택>");
			}

			keyCode = System.in.read();

			if (keyCode == 49) {
				System.out.println("예금액>");
				int money1 = scanner.nextInt();
				balance += money1;
				System.out.println("잔액 =" + balance);
				
				
				
			} else if (keyCode == 50) {
				System.out.println("출금액");
				int money2 = scanner.nextInt();
				balance -= money2;
				System.out.println("잔액 =" + balance);
				
				
			} else if (keyCode == 51) {
				System.out.println("잔액 =" + balance);
				
			} else if (keyCode == 52) {
				run = false;
			}

		}

		System.out.println("프로그램 종료");
	}
}
