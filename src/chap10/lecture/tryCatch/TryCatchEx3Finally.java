package chap10.lecture.tryCatch;

public class TryCatchEx3Finally {
	public static void main(String[] args) {
		
		try {
		Class.forName("java.lang.String2");
		System.out.println("클래스 찾음");
		return; 
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 찾을 수 없음");
		
		} 
		finally {
			// 예외 발생 하든, 하지 않든 실행되어야 하는 statement는 여기에 넣어줌
			System.out.println("무조건 실행");
		}
		
		
		System.out.println("프로그램 종료");
	}
}


//출력 결과
//클래스 찾을 수 없음
//무조건 실행
//프로그램 종료
