package chap07.examples.sec070702;

public class CarExample {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		
		for (int i = 1; i<= 5; i++) {
			int problemLocation = car.run();
		
		
		switch(problemLocation) {
		
		case 1 :
			System.out.println("앞왼쪽 Hankook Tire로 교체");
			car.frontLeftTire = new HankookTire("앞왼쪽", 15);
		case 2 : 
			System.out.println("앞오른쪽 kumho tire로 교체");
			car.frontRightTire = new KumhoTire("앞오른쪽", 13);
		case 3 :
			System.out.println("뒤왼쪽 Hankook tire로 교체");
			car.backLeftTire = new HankookTire("뒤왼쪽", 14);
		case 4 :
			System.out.println("뒤오른쪽 Kumho tire로 교체");
			car.backRightTire = new KumhoTire("뒤오른쪽", 17);
			
			
		}
		System.out.println("-----------------------------");
		
		}
		
		
	}
	

}
