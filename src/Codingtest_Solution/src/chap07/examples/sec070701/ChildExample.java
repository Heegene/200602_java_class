package chap07.examples.sec070701;

public class ChildExample {
	public static void main(String[] args) {
		
		Child ch = new Child();
		

		Parent pr = ch; // 자동 타입 변환
		
		pr.method1(); // parent method() 출력
		pr.method2(); // child-method2() 출력 재정의된(오버라이딩된) 게 출력됨
		// 부모 타입으로 자동 변환된 이후에는 부모 클래스에 선언된 필드와 메소드만 접근이 가능함
		// 변수는 자식 객체를 참조한다 하더라도, 변수로 접근 가능한 멤버는 부모 클래스의 멤버로 한정
		// 다만, 메소드가 자식 클래스에서 오버라이딩 되었다면 자식 클래스의 메소드가 대신 호출
		
		
//		pr.method3(); // 컴파일 에러 
// 		Parent 타입으로 변환된 이후에는 method3()을 호출할 수 없음
// 		하지만 method2()의 경우 부모, 자식 모두에게 있는데 이 경우에는 타입 변환 이후에도 자식 메소드(오버라이딩된것) 로 호출 
		
// 		cat is animal 과 같은 방식으로 자식을 부모화할 수 있는데
//		대신 자식을 부모화하면 자식 고유의 형질은 사용할 수 없게 됨
//		다만 자식일 때 오버라이딩했던 메소드는 부모 타입으로 호출한다 하더라도 자식 기준의 메소드로 호출 
	}
}
