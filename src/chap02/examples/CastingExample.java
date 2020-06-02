package chap02.examples;

public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue); // '가' 출력
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue); // 500 출력
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue); // 3 출력 (소수점 이하 값이 날아가버림) 
		
				
		
	}
}
