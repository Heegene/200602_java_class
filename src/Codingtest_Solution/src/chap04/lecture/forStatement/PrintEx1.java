package chap04.lecture.forStatement;

public class PrintEx1 {
	public static void main(String[] args) {
		// sysout println 출력문 주의사항
		
		System.out.println("출력문");
		System.out.println("출력문2");
		
		// 쓸 때마다 커서가 아래 줄로 내려감
		
		System.out.println(); // 빈 sysout은 다음 줄로 내리는 방법
		System.out.println("출력문3");
		// inline으로 사용하는 방법이 있음
		
		// System.out.print(); 는 출력 다음 커서가 내려가지 않음 
		
		System.out.print("출");
		System.out.print("력");
	}
}
