package chap07.examples.sec070804;

public class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
		
	}
	
	@Override
	public void sound() {
		System.out.println("애옹~~~~");
	}
	
	
}
