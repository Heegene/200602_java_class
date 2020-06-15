package chap11.lecture.toString;

public class MyClass {
	private int id;
	private String name;
	
		
		
	@Override
	public String toString() {
		return this.id + ", " + this.name;
	}
	
}
