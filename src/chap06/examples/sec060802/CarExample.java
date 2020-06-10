package chap06.examples.sec060802;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);;
		
		boolean gasState = myCar.isLeftGas(); // gasstate는 isleftgas 메소드에서 반환되는 t/f 값을 받음
		// gasstate라는 변수로 저장을 해야 다음 statement에 쓰기 편하므로 먼저 선언
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run(); // 
		}
		
		if(myCar.isLeftGas()) { // 가스잔량이 있는경우 isleftgas는 true를 리턴
			System.out.println("gas를 주입할 필요가 없습니다."); // 그러면 주입할 필요 없다고 출력
		} else { // 가스잔량이 없는경우 isleftgas는 false를 리턴
			System.out.println("gas를 주입하세요.");
		}
		
	}
}
