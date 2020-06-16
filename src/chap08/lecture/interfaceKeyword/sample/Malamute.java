package chap08.lecture.interfaceKeyword.sample;

public class Malamute extends KindaDog implements Pet, SledDog { // 인터페이스 받는 건 implements+인터페이스명 
	// Kindadog extends하면 추상메소드 howl 구현해야함 
	@Override
	public void howl() {
		System.out.println("아울~~");
	}
	
	// 인터페이스 쓰면 그안에 있는 메소드를 구현해줘야 하는 책임이 있음
	// 구현 안하면 컴파일 에러 발생
	
	@Override
	public void sit() {
		System.out.println("앉습니다.");
	}
	
	@Override
	public void pull() {
		System.out.println("썰매를 끕니다.");
	}
}
