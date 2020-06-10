package chap06.lecture.method.parameter;

public class ParamEx1 {
	// parameter
	public static void main(String[] args) {
		MyClass c = new MyClass();
		
		c.myMethod();
		c.myMethod(10000L);
		c.myMethod(3);
//		출력결과
//		파라미터 없는 마이메소드
//		파라미터 int 마이 메소드
//		파라미터 long 마이 메소드
		c.myMethod(1,3);
		c.myMethod(1,2,3,4,5,6,7,8,10);
		
		
	}
	
}
