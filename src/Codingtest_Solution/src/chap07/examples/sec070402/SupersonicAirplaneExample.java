package chap07.examples.sec070402;

public class SupersonicAirplaneExample {
	
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();
		sa.fly();
		
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		
		sa.flyMode = SupersonicAirplane.NORMAL;
		
		sa.fly();
		sa.land();
		
//		출력 결과
//		이륙합니다.
//		일반 비행합니다.
//		초음속 비행합니다.
//		일반 비행합니다.
//		착륙합니다.

		
		
	}

}
