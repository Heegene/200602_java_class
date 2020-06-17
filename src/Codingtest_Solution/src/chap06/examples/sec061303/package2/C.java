package chap06.examples.sec061303.package2;

import chap06.examples.sec061303.package1.A;

public class C {
	
	
	public C() {
		
		A a = new A();
		a.field1 = 1;
		a.field2 = 1; // default 이므로 컴파일에러
		a.field3 = 1; // private 
		
		a.method1(); 
		a.method2(); // default 메소드
		a.method3(); // private 메소드 
	}
	
}
