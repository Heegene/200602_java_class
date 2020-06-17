package chap02.examples;

public class PromotionExample {
	public static void main(String[] args) {
		// 책1 51p 예제
		byte byteValue = 10;
		int intValue = byteValue; // byte를 int로
		System.out.println(intValue); // 10 출력
		
		char charValue = '가';
		intValue = charValue; // char를 int로 
		System.out.println("가의 유니코드 =" +intValue ); // 44032 
		
		intValue = 500;
		long longValue = intValue; // int를 long으로 
		System.out.println(longValue); //500 
		
		intValue = 200;
		double doubleValue = intValue; // int를 double 로 
		System.out.println(doubleValue); //200.0 
		
		
	}
}
