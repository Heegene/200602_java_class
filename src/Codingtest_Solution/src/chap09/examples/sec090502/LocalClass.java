package chap09.examples.sec090502;

public class LocalClass {
	interface MyInterface {
		
	}
	
	void method() {
		int a = 3;
//		a = 4; // effecitvely final이므로 불가능 
		MyInterface i = new MyInterface() {
			// 클래스를 만들고 인스턴스를 만드는 두 가지를 한꺼번에 했음 
			void method() {
				System.out.println(a);
			}
		};
	}

}
