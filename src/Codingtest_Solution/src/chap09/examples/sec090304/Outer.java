package chap09.examples.sec090304;

public class Outer {
	
	String field = "Outer-field";
	
	void method() {
		System.out.println("Outer-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-Method");
			
		}
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outer.this.field);
			Outer.this.method();
		}
		
	}

}
