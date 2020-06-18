package chap10.lecture.tryCatch;

public class TryCatchEx2 {
	public static void main(String[] args) {
		
		try {Class.forName("java.lang.String2"); // forName은 String으로 받은 그 이름을 가지고 있는 클래스 인스턴스를 반환
			System.out.println("클래스를 찾아서 어떤 일을 함");
		}
		catch (ClassNotFoundException e) {
			System.out.println("클래스 없음");
		}
		
		System.out.println("프로그램 종료");
	}

//출력 결과
//클래스 없음
//프로그램 종료


}
