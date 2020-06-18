package chap10.lecture.throwKeyword;

public class ThrowEx1 {
	public static void main(String[] args) throws Exception {
		
			method1(); // 여기서 throws를 하든 try catch를 하든 해 주어야 함
//			JVM까지 throws하면 Exception(메세지)를 볼 수 있음
//			Exception in thread "main" java.lang.Exception: 아이가 3보다 큽니다. 
//			at chap10.lecture.throwKeyword.ThrowEx1.method1(ThrowEx1.java:19)
//			at chap10.lecture.throwKeyword.ThrowEx1.main(ThrowEx1.java:6)

		
		
		
		
	}
	
	private static void method1() throws Exception {
		int i = 4;
		if (i > 3) {
			// exception을 만들어서 던지고 싶은 것
			// 익셉션을 던진다는건 실제 인스턴스를 던지는거므로 새로 만들어야 함
			throw new IgreaterThanThreeException("아이가 3보다 큽니다. "); // 여가서 발생시키고 여기서 try catch 하는건 무의미하니까
			//해당 메소드에 throws 쓰고 위로 책임을 넘김 
			// Exception()은 파라미터 있는것도, 없는것도 있으므로 메세지 출력할 수 있음 Exception(메세지) 이런식으로 
			
		}
		System.out.println("메소드1 종료");
		
	}

}
