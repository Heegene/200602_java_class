package chap08.examples.sec080502;

public class Car {
	Tire frontLeftTire = new HankookTire(); // 타이어 인터페이스를 구현한 한국타이어의 인스턴스가 타이어 타입으로 할당될 수 있음 
	Tire frontRightTire = new HankookTire();
	
	Tire backLeftTire = new KumhoTire();
	Tire backRightTire = new KumhoTire();
	
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
		
	}
	
}
