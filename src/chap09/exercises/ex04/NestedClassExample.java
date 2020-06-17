package chap09.exercises.ex04;

public class NestedClassExample {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire(); // 인스턴스 중첩 클래스이므로 객체로 먼저 접근해서 new Tire();
				
		Car.Engine engine = new Car.Engine(); // Static 중첩 클래스이므로 바로 클래스로 접근하여 객체 생성
	}
}
