package chap06.examples.sec060802;

public class Car {
	
	// 필드
	int gas; // gas 라는 필드 설정 
	
	
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas; // 가스량을 설정하는 파라미터 int 하나를 받음
		// 얘는 보이드라 return 없어도됨 
	}
	
	boolean isLeftGas() {
		if (gas==0) { // gas 가 0이면 없다고 출력하고 false로 메소드 종료
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true; // 해당하지 않으면 true를 리턴하고 메소드 종료
	}
	
	void run() {
		while(true) {
			if (gas > 0) {
				System.out.println("달립니다. (gas 잔량: " + gas + ")");
				gas -= 1; // 가스 잔량이 0보다 큰 경우 달립니다 하고 gas 에서 -1을 뺀 뒤 while문 반복
				// gas가 0보다 큰 한 true 이므로 while 문이 반복됨
			} else {
				System.out.println("멈춥니다. (gas 잔량: " + gas + ")");
				return;  // 이게 없으면 무한 loop에 빠짐 
				
				// gas가 0인 경우 멈춤처리되고 return으로 메소드가 종료됨 
			}
			
		}
	}
	
	
}
