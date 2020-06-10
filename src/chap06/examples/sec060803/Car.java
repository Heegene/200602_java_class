package chap06.examples.sec060803;

public class Car {
	// 필드
	int speed;
	
	
	//생성자
	
	//메소드
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	
	void run() { // 클래스 안에서 다른 메소드가 다른 메소드를 호출할 수 있음 
		for (int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("달립니다. 시속 :" + speed + "km/h");
			
		}
	}
}
