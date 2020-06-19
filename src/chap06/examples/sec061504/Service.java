package chap06.examples.sec061504;

public class Service {
	
	@PrintAnnotation
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	@PrintAnnotation("*") // value에 값을 줘서 "-" 에서 "*"로 바꿈
	public void method2() {
		System.out.println("실행 내용2");
	}
	
	@PrintAnnotation(value="#",number=20) // element 값을 명시해서 줄 수 있음 
	public void method3() {
		System.out.println("실행 내용 3");
	}
	

}
