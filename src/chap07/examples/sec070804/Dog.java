package chap07.examples.sec070804;

public class Dog extends Animal{
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("왈왈!!!!!");
	}
}
