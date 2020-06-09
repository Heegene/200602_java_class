package chap06.examples.sec060602;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car(); // myCar 라는 참조변수를 통해서 Car 클래스 수입해옴 
		// myCar는 참조변수이면서 참조값을 가지고있음 new Car();이부분이 실제 객체
		// 근데 myCar.company 이렇게되어있을때 그냥 myCar 객체라고 함
		
		System.out.println("제작회사 = " + myCar.company);
		System.out.println("모델명 = " + myCar.model);
		System.out.println("색상 = " + myCar.color);
		System.out.println("최대속도 = " + myCar.maxSpeed);
		System.out.println("현재속도 = " + myCar.speed);
		
		
		myCar.speed = 60;
		System.out.println("수정된 속도 = " + myCar.speed);
	}
}
