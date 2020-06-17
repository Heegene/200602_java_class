package chap06.lecture.method.returnkeyword;

public class ReturnEx1 {
	public static void main(String[] args) {
		
	
	MyClass c = new MyClass();
	
	int a = c.method2(); // method2가 1을 리턴해서 그걸 int a에 ㅐ입
	
	System.out.println(a); // 1 출력
	
	int b = c.method3(20);
	int d = c.method3(-20);
	
	System.out.println(b);
	System.out.println(d);
	}
}
