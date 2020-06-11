package chap06.examples.konge;

import java.util.Scanner;

public class dogsalon {
	public static void main(String[] args) throws Exception {
		int balance = 0;
		KongEClass kong = new KongEClass();
		Scanner sc = new Scanner(System.in);
		String[] bannedlist = new String[100];
		int bannedlistSize = 0;

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
				if (balance == 0) {
					System.out.println(dogname + " 보호자님 ..  마일리지가 없으세요 ...저희 샵은 고품격 회.원.제 선.불.이.세.요^^..");
					continue;
				}
				System.out.println("저희 샵에 " + dogname + "를(을) 맡겨주셔서 감사합니다. 디자인을 선택해 주세요.");
				System.out.println("1. 곰돌이컷 : 70,000원  |  2. 백숙컷 : 45,000원  |  3. 닭발 미용 : 15,000원 ");
				System.out.println("선택 >");
				int designSelect = sc.nextInt();
				
				switch (designSelect) {
				
				case 1: balance = kong.bearcut();
				
						if (kong.event) {
							bannedlist[bannedlistSize] = dogname;
							bannedlistSize++;
						}
						System.out.println("곰돌이컷을 한 귀여운 모습의 "+dogname+"이(가) 나왔습니다.");
						break;
				
				case 2: balance = kong.chickencut();
						System.out.println("곰돌이컷을 한 귀여운 모습의 "+dogname+"이(가) 나왔습니다.");
						if (kong.event) {
							bannedlist[bannedlistSize] = dogname;
							bannedlistSize++;
						}
						break;
				
				case 3: balance = kong.chickenlegcut();
						System.out.println("곰돌이컷을 한 귀여운 모습의 "+dogname+"이(가) 나왔습니다.");
						if (kong.event) {
							bannedlist[bannedlistSize] = dogname;
							bannedlistSize++;
						}
						break;
				
				}
				
				
				
				
			} else if (selectNo == 2) {
				// 마일리지 충전관련
				System.out.println("마일리지 충전 도와드리겠습니다.");
				System.out.println("저희 샵은 탈세를 통한 이득을 고객님과 나누고 있습니다.");
				System.out.println("현금으로 결제하시면 10% 추가 충전을 해 드리는데 어떻게 결제하시겠어요?");
				System.out.println("1. 현금결제  | 2. 카드결제 ");
				System.out.println("선택 >");
				int chargeSelect = sc.nextInt();
				
				switch (chargeSelect) {
				case 1: // 현금충전 메소드 실행
						System.out.println("현금 적립 도와드리겠습니다*^^*");
						System.out.println("얼마를 충전하시겠습니까?");
						balance = kong.cashpayment(sc.nextInt());
						
						break;
				case 2: // 카드충전 메소드 실행 
						System.out.println("아..카드요..네...도와드리겠습니다..");
						System.out.println("다음부터는 가급적 현금결제 부탁드려요^^");
						System.out.println("얼마 충전하실건가요?");
						balance = kong.cardpayment(sc.nextInt()); 
						break; 
				}

			} else if (selectNo == 3) {
				// 잔액 확인
				System.out.println("마일리지 잔액은 " + balance + " 원 입니다.");
			} else if (selectNo == 4) {
				// 재입장
				System.out.println("재입장 도와드리겠습니다. 강아지 이름을 알려주세요.");
				System.out.println("강아지 이름>");
				String dogname2 = sc.next(); // list에 올라간 이름과의 대조를 위해
				// 사용자가 이름 재입력 
				
				for (int i=0; i<bannedlistSize; i++) { // bannedlistSize만큼 반복
					
					boolean a = bannedlist[i].equals(dogname2); // 
					if (a) {
						System.out.println(dogname2 + " 는 입질이 워낙 심한 강아지라서요 . . 저희샵에서 지향하는 바와는 달라 함께 할 수 없네요.");
						System.out.println("죄송하지만 나가주셨으면 합니다 . . 저희 디자이너분이 물리셔서요 . . ");
						System.out.println("쫓겨났습니다. ");
						run=false;
						
						
					}
					
				}
//				
			} else if (selectNo == 5) {
				// 나가기
				System.out.println("프로그램 종료");
				run = false;
			} 

		}

	}
}
