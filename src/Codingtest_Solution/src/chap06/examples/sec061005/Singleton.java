package chap06.examples.sec061005;

public class Singleton {
	private static Singleton singleton = new Singleton();
	// 이 클래스에는 static 필드 하나, 생성자, 스태틱 메소드 하나 이렇게 있음
	
	private Singleton() {}
	
	// 전체 내용에서 하나의 인스턴스만 만들게 하고 싶다면
	// 생성자를 접근하지 못하게 할 수 있음
	
	// private Singleton() {} 이렇게 private 키워드 붙임 
	// 외부에서 접근할 수 없음(해당 파일 밖에서 Singleton obj1 = new Singleton (); 이렇게 생성 불가
	// 인스턴스를 만들고 사용하려면 
	// 하나의 메소드에 private이 아닌 메소드로
	// return을 singleton을 리턴해주는 방식
	
	
	static Singleton getInstance() {
		return singleton; // 해당 클래스 파일의 참조변수 하나를 리턴함
		// static field 이고 얘가 참고하고 있는 건 Singleton() 이라는 새로운 인스턴스
		// 외부에서는 접근 못하지만 내부에서는 접근 가능함
		// 초기값이 한번 넣은상태로 고정이라 같은 참조값만 계속해서 받음
		
	}
	
}
