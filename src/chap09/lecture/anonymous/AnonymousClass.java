package chap09.lecture.anonymous;

public class AnonymousClass {
	public MyClass c1 = new MyClass();
	private MyClass c2 = new SubClass();

	private MyClass c3 = new MyClass() {
		@Override
		public void method() {
			System.out.println("익명 클래스 메소드");
		}
	};

	public void method() {
		MyClass c4 = new MyClass() {
			@Override
			public void method() {
				System.out.println("지역 익명 클래스의 메소드");
			}
		};

		method(new MyClass() {
			@Override
			public void method() {
				System.out.println("파라미터로 넘긴 익명 클래스의 메소드");
			}
		});

	}
	public void method(MyClass c) {
		c.method();
	}
}
