package chap06.examples.sec061102;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	final static double EARTH_SURFACE_AREA; 
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS; // static 으로 선언되었으므로 클래스명으로도 바로 호출 가능
		// 표면적은 스태틱 블럭 안에서 값을 초기화해 주었음 
		
		// Math.PI는 자바에서 제공하는 상수
		
	}
	
}
