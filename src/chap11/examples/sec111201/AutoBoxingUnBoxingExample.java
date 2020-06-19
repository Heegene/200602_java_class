package chap11.examples.sec111201;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		
		// 자동 박싱
		Integer obj = 100;
		System.out.println("value is " + obj.intValue());
		
		// 대입 시 자동 언박싱
		int value = obj;
		System.out.println("value is " + value);
		
		// 연산 시 자동 언박싱
		int result = obj + 100;
		System.out.println("result is " + result);
		
		
		
	}
}
