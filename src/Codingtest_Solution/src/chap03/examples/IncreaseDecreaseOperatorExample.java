package chap03.examples;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z; // 선언만 하고 값 할당 x
		
		System.out.println("-----------------");
		x++; // x = 11
		++x; // x = 12
		System.out.println("x = " + x); // x = 12
		
		System.out.println("------------------");
		y--; // y = 9
		--y; //  y = 8
		System.out.println("y= "+ y);
		
		System.out.println("-------------------");
		z = x++; // 증감연산자가 변수 뒤에 있으면 다른 연산자를 먼저 처리한 후 변수를 증감시킴
		// 이전 stat에서 x 12인상태에서 ++연산지 다른 연산과 같이 사용되고있음. z = x 를 먼저 사용하고나서 ++는 비게됨
		
		System.out.println("z= " + z); // z = 12
		System.out.println("x= " + x); // x = 13 
		
		System.out.println("-------------------");
		z = ++x; // 증감연산자가 변수 앞에 있으면 우선 변수를 증감시킨 다음 다른 연산자 계산 
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		
		System.out.println("--------------------");
		z = ++x + y++;
		System.out.println("z = " + z);
		System.out.println("y = " + y);
		System.out.println("x = "+ x);
		
	}
}
