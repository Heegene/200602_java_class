package chap10.lecture.tryCatch;

public class TryCatchEx6MultiCatch {
	public static void main(String[] args) {
		
		try {
			;;;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생");
		} catch (NumberFormatException e) {
			System.out.println("예외 발생");
		}
		// 다른 유형의 예외에 똑같은 대응 실행을 시킬거라면
		// ArrayIndexOutOfBoundsException | NumberFormatException 이런식으로 or 처리 가능 
	}
}
