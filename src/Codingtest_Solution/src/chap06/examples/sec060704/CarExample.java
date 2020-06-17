package chap06.examples.sec060704;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car(); // 기본 car class 초기값
		System.out.println("car1 company = " + car1.company);
		System.out.println(); 
		
		Car car2 = new Car("자가용"); // car class 초기값에 모델 자가용으로 적용됨
		System.out.println("car2 company = " + car2.company);
		System.out.println("car2 model = " + car2.model);
		System.out.println();
		
		Car car3 = new Car("자가용", "빨강"); // car class 초기값에 자가용과 color 값 적용됨
		System.out.println("car3.company = " + car3.company);
		System.out.println("car3.model = " + car3.model);
		System.out.println("car3.color = " + car3.color);
		System.out.println();
		
		Car car4 = new Car("택시", "검정", 200); // car class 초기값에 model, color, maxSpeed 값 적용됨 
		System.out.println("car4.company = " + car4.company);
		System.out.println("car4.model = " + car4.model);
		System.out.println("car4.color = " + car4.color);
		System.out.println("car4.maxSpeed = " + car4.maxSpeed);
		
		
		
	}
}
