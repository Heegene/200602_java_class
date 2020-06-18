package chap10.lecture.tryCatch;

public class TryCatchEx1 {
	public static void main(String[] args) {

		// Exception을 처리할 수 있는 방법
		try { // Exception이 발생할 수 있는 범위를 try 블럭 안에 지정해줌 
			String s = args[0]; // ArrayIndexOutOfBoundsException발생
			System.out.println("예외 발생하지 않음");
		} catch (ArrayIndexOutOfBoundsException e) {// 잡을 exception 타입을 정의해주고 그걸 담을 참조변수명을 작성 String s처럼 타입+변수명
			System.out.println("익셉션 발생");
			System.out.println("배열의 길이가 바르지 않습니다.");
		}
		
		System.out.println("프로그램 종료");
	}
}

//출력결과
//익셉션 발생
//배열의 길이가 바르지 않습니다.
//프로그램 종료

