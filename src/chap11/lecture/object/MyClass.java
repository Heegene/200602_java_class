package chap11.lecture.object;

public class MyClass extends Object {
	private int id;
	
	@Override
	public boolean equals(Object obj) {
		MyClass o = (MyClass) obj; // obj.id를 바로 받을 수 없으므로 하나 만들어서 받을 수 있도록 강제형변환
		
		
		return this.id == o.id;
	}
}
