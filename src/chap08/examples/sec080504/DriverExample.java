package chap08.examples.sec080504;

public class DriverExample {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Bus bus = new Bus(); // Bus, taxi 모두 vehicle 을 implement함
		Taxi taxi = new Taxi();
		
		driver.drive(bus); // 따라서 실행될때 drive 안의 run() 사용가능 
		driver.drive(taxi);
		
	}
}
