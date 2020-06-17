package chap03.lecture.binary;

public class ArithmeticOperator {
	
	public static void main(String[] args) {
		// + - * / % 이항연산자 산술연산자
		// 피연산자는 byte , short, int, long, float, double, char 가 가능
		// 연산의 결과는 int, long, float, double 로 나옴
		
		int a = 5;
		int b = 7;
		int c = 5 + 7;
		
		c = 5 - 7; // int까지 연산하면 연산의 결과가 int로 나옴
		c = 5 * 7;
		c = 5 / 7; // 이 경우 답이 0이 나옴 int타입이라 소숫점 날라감
		
		double d = 3.14;
		double e = 2.12;
		double f = d + e;
		System.out.println(f);
		
		f = d - e;
		f = d * e;
		f = d / e;
		
		c = b % a; // 나누고 나서 나머지
		f = c * d ; // 다른 타입끼리 연산하는 경우 보다 넓은 범위를 저장할 수 있는 타입으로 결과가 나옴.
		// int와 double이라면 double타입으로 나옴 
		
		char g = 'A';
//		char k = g + 1 =; // 결과가 int로 나오므로 컴파일 에러가 발생 
		System.out.println(g);
		
//		산술연산 사용시 주의사항 
//		overflow를 조심해야함
		int i1 = 2000000000;
		int i2 = 1000000000;
		int i3 = i1 + i2 ;
		System.out.println(i3); // 30억이 아니라 -1294967296가 출력됨
//		int는 32비트니까 32비트로 표현 가능한 게 21억 얼마정도밖에 안됨 
//		연산 결과가 그걸 넘어서면 32비트가 저장 가능한 값의 범위를 넘어섬 그래서 결과를 잃어버리게 됨 
//		내가 사용할 값의 범위가 어느 정도인지 잘 알고 타입을 결정해서 사용해야 함 
//		십억단위 그냥 넘어가는 경우 long type으로 사용하는 것이 좋음 
//		long보다 더 큰경우 double을 사용한다든가 그걸 더 넘어가면 자체적으로 자료형을 만들어서 사용 
		
		
		
	}
}
