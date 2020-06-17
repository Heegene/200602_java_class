package chap06.examples.sec060901;

public class CarExample {
	
	public static void main(String[] args) {
		
	Car myCar = new Car("포르쉐");
	Car yourCar = new Car("벤츠");
	
	myCar.run(); // 각 인스턴스의 필드와 메소드를 실행 mycar, yourcar 별도로 실행됨
	yourCar.run(); // 각각 10~~50으로 값을 갖게됨 mycar와 똑같은 내용을
	// yourcar의 speed 필드에 저장이 되는것 
	}

}
