package chap08.lecture.interfaceKeyword.sample;

public interface Pet {
	// Class가 아니라 interface라는 이름이 작성됨
	// 명명 규칙은 클래스 만드는 것과 동일하게 UpperCamelCase로 작성
	
	public abstract void sit(); 
	// 인터페이스에서는 자바 8 이전에는 추상 메소드만 들어갈 수 있었음
	// 그래서 abstract를 쓰나 안 쓰나 몸통을 작성할 수 없으므로 상관이 없었음
	// 그래서 abstract 생략 가능
	// 그리고 만들어 내는 추상 메소드는 다 public이었음(자바 8 이전)
	// 그래서 public abstract void sit() 이나 void sit()이나 똑같았음

}
