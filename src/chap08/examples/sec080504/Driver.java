package chap08.examples.sec080504;

public class Driver {
	public void drive(Vehicle vehicle) { // Vehicle 타입을 받으면 run 메소드가 있다는 것이 보장되어 있으므로
		vehicle.run(); // vehicle.run이 구현 가능해짐 
	}
}
