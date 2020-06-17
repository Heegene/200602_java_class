package chap06.examples.sec060803;

public class CarExample {
	
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.keyTurnOn(); // 단순히 '키를 돌립니다' 라는 메시지를 출력하는 내용
		myCar.run(); // 10부터 시작해서 50이 될때까지 10씩 증가하면서 달립니다. 시속 nn km/h 이라고 출력하는 메소드 실행
		
		int speed = myCar.getSpeed(); // getspeed 메소드는 speed라는 int field를 불러오고, 이건 run에 의해서 증가
		// 해당 speed 값을 myCar.getSpeed() 메소드로 받아옴
		
		System.out.println("현재 속도 = " + speed + "km/h");
		// 받아온 speed 값(run이 돌고 난 결과값)을 출력함 
	}

}
