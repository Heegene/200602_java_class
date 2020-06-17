package chap02.examples;

public class VariableScopeExample {
public static void main(String[] args) {
	int v1 = 15;
	if (v1>10) {
		int v2 = v1 - 10; // v2는 if문 중괄호 안에서만 사용 가능한 상태
		
	}
	int v3 = v1 + v2 + 5; // v2 변수를 사용할 수 없으므로 컴파일 에러 발생 
	System.out.println(v3);
}
}
