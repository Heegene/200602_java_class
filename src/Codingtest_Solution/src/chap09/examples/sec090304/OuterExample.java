package chap09.examples.sec090304;

public class OuterExample {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Nested nested = outer.new Nested();
		
		nested.print();
		
	}

}

//출력결과
//Nested-field
//Nested-Method
//Outer-field
//Outer-method
