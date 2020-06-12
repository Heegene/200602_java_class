package chap07.examples.sec070402;

public class SupersonicAirplane extends Airplane {
	
	public static final int NORMAL = 1;
	public final static int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	
	
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			// Airplane 객체의 fly() 메소드 호출 이번에는 명시적으로 !
			super.fly();
		} 
	}
	
	
}
