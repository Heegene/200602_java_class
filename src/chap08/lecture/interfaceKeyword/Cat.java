package chap08.lecture.interfaceKeyword;

public class Cat extends KindaCat implements Pet {
	public void cry() {
		System.out.println("야옹~~");
	}
	@Override
	public void sit() {
		System.out.println("앉았습니다.");
	}
}
