package chap06.examples.sec061004;

public class Car {
	
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
		
	}
	
	public static void main(String[] args) { // 메인 메소드에서 인스턴스 필드와 메소드를 쓸 수 없음
//		run(); 사용불가 
//		main method는 static이므로 인스턴스를 알려 주지 않으면 메소드를 사용할 수 없음 
		
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run(); 
		
	}

}
