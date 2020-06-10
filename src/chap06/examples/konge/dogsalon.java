package chap06.examples.konge;

import java.util.Scanner;

public class dogsalon {
	public static void main(String[] args) {
		int balance = 0;
		KongEClass kong = new KongEClass();
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		System.out.println("안녕하세요 애견미용 푸들푸들 입니다.");
		System.out.println("오늘 맡기실 강아지 이름은 뭔가요?");
		System.out.println("강아지 이름> ");
		String dogname = sc.nextLine();
		System.out.println("강아지 이름은 " + dogname + "(이)군요!");

		while (run) {
			System.out.println("업무를 선택해 주세요.");
			System.out.println(
					"-----------------------------------------------------------------------------------------------");
			System.out.println("1." + dogname + " 미용 맡기기 2. 마일리지 충전(현금시 +10%혜택) 3. 잔액 확인 4. 재입장 5. 나가기");
			System.out.println(
					"-----------------------------------------------------------------------------------------------");
			System.out.println(" 선택 >");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				System.out.println("저희 샵에 " + dogname + "를(을) 맡겨주셔서 감사합니다. 디자인을 선택해 주세요.");
				System.out.println("1. 곰돌이컷 : 70,000원  |  2. 백숙컷 : 45,000원  |  3. 닭발 미용 : 15,000원 ");
				System.out.println("선택 >");
				int designSelect = sc.nextInt();
				
				switch (designSelect) {
				
				case 1: System.out.println("곰돌이컷");
						break;
				
				case 2: System.out.println("백숙컷");
						break;
				
				case 3: System.out.println("닭발 미용");
						break;
				
				}
				
				
				
				
			} else if (selectNo == 2) {
				// 마일리지 충전관련

			} else if (selectNo == 3) {
				// 잔액 확인
				System.out.println("마일리지 잔액은 " + balance + " 원 입니다.");
			} else if (selectNo == 4) {
				// 재입장
			} else if (selectNo == 5) {
				// 나가기
				System.out.println("프로그램 종료");
				run = false;
			} 

		}

	}
}
