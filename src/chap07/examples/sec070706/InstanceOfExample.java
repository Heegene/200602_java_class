package chap07.examples.sec070706;

public class InstanceOfExample {
	public static void method1(Parent parent) {
		if (parent instanceof Child) { // parent의 타입이 Child이면
			Child child = (Child) parent; 
			System.out.println("method1 - Child로 변환 성공");  // 성공했다고 출력
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
		
		
	}
	
	
	
	public static void method2(Parent parent) {
		Child child = (Child) parent; // 실제로 넘어간 instance가 child면 문제없이 실행되는데 
		System.out.println("method2 - Child로 변환 성공"); 
		
	}
	
	
	public static void main(String[] args) {
		
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent(); // 얘는 child가 아니므로 강제형변환시킬수가 없음 실제 인스턴스 자체가 Parent라
		method1(parentB); // 형변환을 시키려면 애초에 인스턴스 자체가 Child여야 parent로 형변환했다가도 child로 다시 돌릴 수 있는 것 
		method2(parentB);
		
		
	}
	
	
	//출력 결과
//	method1 - Child로 변환 성공
//	method2 - Child로 변환 성공
//	method1 - Child로 변환되지 않음
//  method2 - 강제로 변환하는 과정에서 ClassCastException 이 나타남 
}
