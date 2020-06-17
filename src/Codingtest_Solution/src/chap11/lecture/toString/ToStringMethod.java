package chap11.lecture.toString;

public class ToStringMethod {
	public static void main(String[] args) {
		MyClass c1 = new MyClass();
		// chap11.lecture.toString.MyClass@15db9742 이 출력됨
		// 클래스위치@참조값이 16진법으로 나옴
		// 이거말고 필드에 실제로 어떤값이 있는지 확인하고 싶음
		
		System.out.println(c1);
		System.out.println(c1.toString()); // 0, null 이라고 출력됨 
//		@Override 이렇게 재정의해준 결과
//		public String toString() {
//			return this.id + ", " + this.name;
//		}
//		
		
		
		// 근데 이런거없이 그냥 println() 해도 똑같이 나옴
		// println은 오버로딩되어있어서 그중에 하나가 
		// println(Object o) 이렇게 되어있는 게 있음
		// 
	}
}
