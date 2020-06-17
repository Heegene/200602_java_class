package chap03.lecture.unary;

public class Operator {
	public static void main(String[] args) {
		// 산술, 부호, 대입, 증감, 비교, 논리
		// 조건, 비트, 쉬프트
		
		// 단항, 이항, 삼항 연산자 
		
		int a = 0; // 
		a++; // 이건 항이 하나니까(a) 단항이면서 증감연산자 
		
		int b = 0; 
		int c = a + b; // 이항연산자, 산술 연산자
		
		c = (true) ? a : b; // 삼항연산자 
		
		// 연산의 결과는 하나이며 다양한 타입이 나옴
		
		boolean d = a < b; // integer 끼리 연산했지만 결과가 비교해서 true false로 나옴 
		
		
		// 연산의 결과는 하나의 항으로 사용할 수 있음 
		d = a + b < a - b;
		
		//연산자는 먼저 계산되는 순서(우선순위)를 갖는다. 
		c = a + b * c;
		
//		우선순위가 가장 높은 () 사용
		d = (a + b) < (a - b); 
		
		c = a + (b * c);
		c = (a + b) * c ; 
		
		
		
		
		
		
		
		
		
	}
}
