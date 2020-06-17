package chap07.lecture.polymorphism;

public class Cat extends KindaCat {
	@Override
	public void cry() {
		System.out.println("야옹");
	}
	
	public void walk() {
		System.out.println("걸어간다");
	}
}
