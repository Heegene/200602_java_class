package chap02.lecture;

public class Scope {
 // 변수의 사용 범위
	public static void main(String[] args) {
		int k = 9;
		if (true) {
			int v = 3;
			// 중괄호 안쪽에서 선언된 변수는 중괄호 바깥에서 사용할 수 없음
			System.out.println(v);
			// 선언한 곳 안쪽에서만 쓸 수 있음
			System.out.println(k);
		}
		
	 
		System.out.println(k); // k는 바깥에서 선언되었으므로 실행가능하지만 v는 안에서 선언된거라 사용불가 
	}
}
