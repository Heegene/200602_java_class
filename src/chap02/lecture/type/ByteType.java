package chap02.lecture.type;

public class ByteType {

	public static void main(String[] args) {
		
		// byte
		// 크기 1 byte
		
		byte b;
		// 최대로 범위를 줄 수 있는 범위 127까지
		b = 127;
//		b = 128; 128을 주게 되면 에러가 남 
		b = -128; // -128 값까지도 줄 수 있음
//		b = -129; // -129는 줄 수 없음. -128~127까지의 값만 가능
		
		b = 127;
		b++; 
		System.out.println(b); // -128이 출력됨. 원하지 않는 값이 출력 
//		표현할 수 있는 값을 넘어서 표현한 것으로 이 상황을 overflow라고 함 
	}
	
}
