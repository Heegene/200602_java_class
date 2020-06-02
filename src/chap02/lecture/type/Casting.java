package chap02.lecture.type;

public class Casting {
	public static void main(String[] args) {
		// TYPE 변환을 Casting 이라고 함
		// 1. 자동 타입변환 (또는 형변환 타입=형)
		// 작은 거에서 큰걸로 가능
		// byte -> short 타입으로 변환 가능. 바이트는 1바이트인데 short은 2바이트로 표현하므로
		// 자동변환 가능
	    // byte(1) -> short(2) -> int(4) -> long(8) -> float(4) --> double (8)
					// char(2) ↗ char이 int 로는 가능 
		// float, double 은 더 큰 범위값 저장 가능
		// 단계를 건너뛰는것도 가능
		// boolean type은 형변환 X
		// char(2)의 경우 short type은 음수 양수를 나눠서 저장하므로 char과의 형변환은 불가능
		// 근데 char에서 integer로의 변환은 가능
		// char(2) 
		
		byte b = 3;
		short s = b; // 가능
		char c = '가';
		int i = c; // 이것도 가능
		long l = 999L;
		float f = 0;
		
		
		// 자동 형변환은 연산할 때도 이루어짐
		double d1 = 3.14;
		int i1 = 3;
		System.out.println(i1+d1);
		// type이 다른 것끼리 연산할 때 큰 타입으로 자동으로 변환됨
		// double이 더 큰 타입이므로 double으로 자동 변환됨
		// 결과는 double type으로 나옴 6.14 
		
		// byte, short, integer 끼리 연산하면 연산 결과가 무조건 int로 나옴
		byte b1 = 22;
		byte b2 = 33;
		// byte b3 = b1 + b2; // byte끼리 연산해도 integer라서 오류가 나옴 
		// 그래서 byte 타입이라 integer로 옮겨담을 수 없어서 오류가 뜸
		// 걱정할 건 없고 컴파일러가 알아서 잡아줌
		
		
		
		System.out.println(b3);
		
		
		
		// 2. 강제 타입변환
		long lo = 30000;
		// int in = lo; 이렇게 long type을 int로 넣을 수가 없음. 8바이트를 4바이트로 옮겨넣으면 값을 잃어버릴 수도 있음
		// 강제로 형변환 하는 법
		int in = (int)  lo; // 다만 값을 잃어버릴 것이라 예상하고 옮겨야 함 
		
		short sh = 128;
		byte by = (byte) sh; // 값을 잃어버리거나 이상한 값이 나올 수 있음
		System.out.println(by); // 128이 아닌 -128이 출력됨 
		
		
		
		
		
	}
}
