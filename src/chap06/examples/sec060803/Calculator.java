package chap06.examples.sec060803;

public class Calculator {
	int plus(int x , int y) {
		int result = x + y;
		return result; // 두개를 받아서 더해서 result에 넣어줌
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y); // 두개의 parameter를 받아서 plus라는 메소드 실행
		double result = sum / 2; //더한값을 2로 나누고 result 대입
		return result; // result 리턴
	}
	
	void execute() {
		double result = avg(7,10); // avg 호출하면 7과 10을 더한걸 2로 나눈값이 result에 들어감
		println("실행결과 : " + result); // 또다른 method println 메소드 호출
	}
	
	void println(String message) { // 파라미터의 message레 받아서
		System.out.println(message); // 출력
	}
	
}
