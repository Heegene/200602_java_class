package chap07.lecture.override;

public class SubClass extends SuperClass {
	@Override // 이런식의 표현을 annotation 이라고함 
	public void method1() { // 상위 클래스에 override1이라는 이름이 있으면 오버라이딩 아닌데? 하고 에러를 띄워줌
		
		// 주석같은건데 프로그램의 실행에 영향을 미치지 않음
		// 주석이랑은 뭐가 다르냐면 주석은 진짜 어떤 영향도 미치지 않는데
		// annotation은 라이브러리 등의 시스템에 '힌트'를 줌 
		
		System.out.println("서브클래스 메소드"); // SuperClass에서 정의한 것을 재정의했음
		
		// 이렇게 재정의했다는걸 명시적으로 표시해 줄 수도 있음
		// 앞에 @override 라고함
	}
}
