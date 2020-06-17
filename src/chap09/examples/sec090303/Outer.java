package chap09.examples.sec090303;

public class Outer {
	
	public void method1(final int arg) {
		final int localVariable = 1;
		
		//arg = 100; final param 이므로 재할당 안됨
		//localVariable = 100; // final variable이므로 재할당 안됨
		
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
			
		}
	}
		
		
		// 자바 8 이후 'final' 키워드 생략 가능
		public void method2(int arg) {
			int localVariable = 1;
//			arg = 100; 재할당 안됨
//			localVariable = 100;  마찬가지로 재할당 안됨
			
			class Inner {
				public void method() {
					int result = arg + localVariable;
				}
			}
		}
		

}
