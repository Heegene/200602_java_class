package chap03.examples;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1; // 리터럴 간의 연산은 타입 변환 없이 해당 타입으로 계산되므로 char로 저장됨 
		char c2 = 'A';
		
//		char c3 = c2 + 1; // int타입으로 변환되었으므로 char로 출력 안됨 변수를 사용하면 int로 변환됨 
		System.out.println("c1 is " + c1); // 'B' 출력
		System.out.println("c2 is " + c2); // 'A' 출력 
//		System.out.println("c3 is " + c3); // 컴파일 에러 마찬가지로 뜸 
		
		
		
	}
}
