package chap02.lecture.type;

public class FloatType {
	public static void main(String[] args) {
		// 실수 타입은 float, double 두 가지가 있음
		// float의 크기: 4 byte
		// double의 크기: 8 byte
		// 값을 저장하는 방법이 좀 다름
		// float: IEEE 754 부동소수점 방식으로 저장 
		// 64비트라고 하면 맨 앞의 비트를 부호비트로두고 나머지 63개로 가수와 지수를 나눔
		// 뭐의 몇승 할때의 곱하는거 가수 승수를 지수라고함 8의 2승이라고하면 8 가수 2 지수
		// 차이는 가수부와 지수부가 나눠지는데 double type은 double type이 가수, 지수를 저장할 수 있는 공간이 더 큼
		// 8비트니까 더 큼.. double type은 더 넓은 범위를 촘촘하게 표현할 수 있음
		// -> 아무튼 double이 float 보다 넓은 범위의 수를 더 촘촘하게 표현 가능 
		
		double d;
		d = 3.14;
		System.out.println(d);
		
		float f;
//		f = 3.14; // 얘는 왜 안되냐면 주로 double을 쓰다보니 literal한 실수 표현은 double로 표현됨
		// float는 32bit라 3.14 리터럴은 64비트를 32비트로 표현하려다보니 더 작은공간에 담을수가 x
		// 그럼 literal한 float type 값이다! 표현해주는게 뒤에 f붙이는거
		f = 3.14F;
		// 얘도 long type과 마찬가지로 대문자 F 붙여주면 됨 
		System.out.println(f);
		
		
		// literal한 실수 표현 방식은 10의 n승으로도 표현할 수 있음
		d = 3e6; // 3*10의 6승 3*10^6 이 됨  300만이 나옴
		System.out.println(d);
		d = 2e-3; // 2*10^-3 ==> 0.002
		System.out.println(d);
		
		// 실수 표현의 한계
		double d1 = 0.1;
		double d2 = 0.2;
		double d3 = d1 + d2; // 결과가 0.30000000000000004 이 나옴
		// 10진법으로 쓴 0.1은 2진법의 한계상 완전히 들어맞는 값이 아닌 근사값이 나오게 됨 
		
		System.out.println(d3);
		
	}
}
