package chap03.examples;

public class OverflowExample {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z); // -727379968 출력됨 integer 범위 넘어가서 원하지않는값이 나옴 
		
		long a = 1000000;
		long b = 1000000;
		long c = a * b;
		System.out.println(c); // 1000000000000 출력 long type을 선택해 원하는 값 출력 
		
		
	}
}
