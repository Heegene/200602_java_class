package chap10.examples.sec100301;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) { // 예외 발생하지만 예외처리코드를 통해 컴파일러 빨간오류 안뜨고 넘어가게 됨 
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
	}
	

}
