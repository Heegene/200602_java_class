package chap07.examples.sec070702;

public class Car {
	
	// 필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6); // roll method는 Tire 타입의 3가지 타입의 인스턴스로 활용될 수 있는데
	// Tire가 상위클래스이기때문에 한국타이어 금호타이어를 다 받을 수 있음 
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	//생성자
	
	//메소드
	int run() { // run 할때마다 각 바퀴의 roll method를 실행함 
		System.out.println("자동차가 달립니다.");
		if(frontLeftTire.roll() == false ) { stop(); return 1;}
		if(frontRightTire.roll() == false ) { stop(); return 2;}
		if(backLeftTire.roll() == false ) { stop(); return 3;}
		if(backRightTire.roll() == false ) { stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다. ");
	}
	

}
