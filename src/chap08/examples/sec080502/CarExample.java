package chap08.examples.sec080502;

public class CarExample {
	public static void main(String[] args) {
		
		Car mc = new Car();
		
		mc.run();
		
		mc.frontLeftTire = new KumhoTire();
		mc.frontRightTire = new KumhoTire();
		
		mc.run(); 
		
	}
}
