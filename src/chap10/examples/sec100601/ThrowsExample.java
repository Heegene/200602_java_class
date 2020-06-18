package chap10.examples.sec100601;

public class ThrowsExample {
	public static void main(String[] args) {
		
		try {
			findClass(); // 해당 메소드를 호출한 이곳에서 예외가 발생하여 
		} catch (ClassNotFoundException e) { // 예외처리를 catch 로 진행 
			System.out.println("클래스가 존재하지 않습니다.");
		}
		}
	public static void findClass() throws ClassNotFoundException { // 여기에서 컴파일 에러가 발생하지 않고
		Class clazz = Class.forName("java.lang.String2");
	
	}
}
