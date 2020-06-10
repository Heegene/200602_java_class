package chap06.examples.konge;

public class KongEClass {
	String dogname;
	int balance;
	boolean event;

	int bearcut() { // 곰돌이컷 내용
		this.balance -= 70000;
		int x = (int)(Math.random()* 10) + 1; // 랜덤으로 개가 무는 이벤트 
		if (x > 2) {
			System.out.println("아야!!! 개 교육을 어떻게 시키신 거예요;;; 제 손을 물었잖아요;; 치료비 50,000원 추가 차감하겠습니다.");
			this.balance -= 50000;
			this.event = true;
		}
		return balance;
		
	}
	
	int chickencut() { // 백숙컷 내용
		this.balance -= 45000;
		
		int x = (int)(Math.random()* 10) + 1;
		if (x > 2) {
			System.out.println("아야!!! 개 교육을 어떻게 시키신 거예요;;; 제 손을 물었잖아요;; 치료비 50,000원 추가 차감하겠습니다.");
			this.balance -= 50000;
			this.event = true;
		}
		
		return balance;
	}
	
	int chickenlegcut() { // 닭발미용 내용 
		this.balance -= 15000;
		
		int x = (int)(Math.random()* 10) + 1; // 랜덤으로 물리는 이벤트 
		if (x > 2) {
			System.out.println("아야!!! 개 교육을 어떻게 시키신 거예요;;; 제 손을 물었잖아요;; 치료비 50,000원 추가 차감하겠습니다.");
			this.balance -= 50000;
			this.event = true;
			
		}
		
		return balance; 
	}
	
	int cashpayment(int a) { // 현금결제 내용 
		this.balance += (a*1.1); // 10% 추가충전 부분
		return balance;
	}
	
	int cardpayment(int a) { // 카드결제 내용 
		this.balance += a;
		return balance;
	}
	
	
}
