package chap09.lecture.localClass;

public class OuterClass {
	private int field2;
	
	public void method() {
		class LocalClass {
			private int field;
			private int field2;
			public void method() {
				System.out.println(this.field); // 클래스 안에 있는 멤버들끼리 접근 가능하므로 private int 사용가능
				// 근데 this.field 이렇게도 접근 가능
				System.out.println(field2); // 바깥에 있는 필드도 접근 가능
				// 근데 바깥거랑 내부랑 우연히 이름이 같다면 ! (로컬클래스 내에 똑같은 이름의 필드가 있다면)
				// 그 경우 가장 가까이 있는 로컬클래스 내부의 필드를 가리키게 됨
				// 근데 같은 이름의 바깥 클래스 멤버를 지칭하고 싶다면
				System.out.println(OuterClass.this.field2); 
				
				
			}
		}
	}
	

	public void method(final int p) {
		final int a = 3; // 지역변수 사용하려면 초기값 있어야함
//		a = 4; // final이므로 값 할당 못함 
//		p = 3; 이것도 값을 변경하려고 하면 안됨 effectively final 
		class LocalClass {
			void method() {
				System.out.println(a); // 상위 클래스의 지역변수에도 접근 가능
				// 근데 사용할 때 int aLocal = a; 이런식으로 잡아서 사용하게되는거 cathed variable?
				// 지역변수가 메모리에서 사라지고 잡아온것만 남아있을 수 있는 상황 생김
				// 그래서 지역변수는 항상 final이어야 함 값을 변경할 수 없게 만들어 놔야 함
				// final을 적지 않더라도 자동으로 final 처리됨 
				// effectively final 이라고함 
				// 근데 이게 자바의 특성이고 다른 언어에서는 지역변수를 변경할 수 있게 해 두었음 
				System.out.println(p);
				// parameter도 사용할 수 있음 (int p) 하면 사용할 수 있음
				// parameter도 값이 변경되면 안되므로 이것도 final
				// 아예 final int p 이렇게 parameter로 적어줄 수도 있음 

			}
		}
	}

}
