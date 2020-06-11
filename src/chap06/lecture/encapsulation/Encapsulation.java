package chap06.lecture.encapsulation;

public class Encapsulation {
	
	public static void main(String[] args) {
		
	Car car = new Car();
	car.accel();
	car.accel();
	
	// 모든 걸 public으로 해 놓으면 조작하면 안되는 결과물같은것들을 조작할 수 있음
	car.speed = -1; // 이런식으로 조작이 가능함
	// 그래서 private int car speed; 이런식으로 해서 접근 제한 
	
	// 필드가 값을 갖는 데이터, 
	// 인스턴스의 데이터는 노출시키지 않되 메소드는 노출시키는 방법으로 코딩함 
	// 캡슐에 싸서 필요한 것만 공개하는 것을 캡슐화(encapsulation)이라고 함 
	
	
	car.breakAction();
	
	}
}
