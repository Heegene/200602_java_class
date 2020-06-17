package chap02.examples;

public class BooleanExample {

	public static void main(String[] args) {
		boolean stop = true; // boolean type 선언 및 값 할당
		if(stop) {  // stope이 true면 실행
			System.out.println("중지합니다."); // if가 true이므로 이 부분이 실행됨
		} else {
			System.out.println("시작합니다.");
		}
	}
}
