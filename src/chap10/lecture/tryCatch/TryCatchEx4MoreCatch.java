package chap10.lecture.tryCatch;

public class TryCatchEx4MoreCatch {
	public static void main(String[] args) {
		
	try {
		int a = Integer.parseInt(args[4]);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("배열의 범위를 초과하였습니다.");
	} catch (NumberFormatException e) {
		System.out.println("수로 변경 불가");
	} finally {
		System.out.println("무조건 실행");
	}
	System.out.println("프로그램 종료");
	}
}
