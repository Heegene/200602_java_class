package chap03.lecture.binary;

public class ComparisonOperator {
	public static void main(String[] args) {
		// < <= > >= > 
		// == != 연산자
		// 피연산자 8개의 타입, 참조 타입을 받을 수 있음
		// 그래도 모두 다 쓸수있는건 아니고 어떤건 어떤타입만 받고 이런게있는데 어차피 컴파일러가 걸러줌
		// 결과는 true false boolean type으로 반환됨
		// Javascript 비교연산자랑 별차이 없는데 
		// Javascript의 경우 type까지 비교해주는 연산자가 있었음 === !==== 근데 자바에는 없음
		// 가능한 한 같은 타입끼리 연산하되 숫자 중에 
		
		int i = 9;
		double d = 9.0;
		// 이처럼 수를 다루는 타입끼리는 다른 타입이어도 연산이 됨
		
		System.out.println(i < d); // false 반환 
		
	}
}
