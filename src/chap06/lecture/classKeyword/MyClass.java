package chap06.lecture.classKeyword;

public class MyClass {
	
	public static void main(String[] args) {
		
	// 만들려는 class의 이름과 똑같은 파일을 만들면 됨
	// MyClass 클래스라면 MyClass.java
	// 앞에 public class MyClass { 클래스 본문} 이런 식으로 작성
	// 그리고 첫 줄에 이 클래스가 어느 패키지 소속인지를 밝혀 주면 됨
	
	// 클래스 이름을 작성하는 방법
	// UpperCamelCase 로 단어의 맨 앞자리를 Uppercase로 작성
	MyClass my = new MyClass(); // 인스턴스 생성되고 heap 영역에 인스턴스 생성됨
	// 이 인스턴스를 사용하기 위해서는 참조값을 보관, 사용하는 참조변수가 있어야함
	// my 를 변수명으로 지정하고 앞에 타입을 정해줌 타입은 클래스명으로 
	// 참조변수의 타입이 MyClass가 되는 것 클래스이름이 변수의 타입명이 될 수 있음
	// 그러면 스택에 my 라는 참조변수가 생기고 heap에 저장되어있던 주소값을 my가 참조값으로 갖게됨
	
	// 객체는 field 와 method가 있는데 (property=field) 
	// 인스턴스의 필드와 메소드가 있으면 설계 정보가 담겨있음
	// 필드를 어케 작성하고 메소드를 어케 작성하는지 보여줄 것
	// 이제 같은 파일명을 가진 클래스가 매우 늘어나므로 패키지를 섹션별로 분리해서 저장할 것 
	
	
	
	
	}
	
}
