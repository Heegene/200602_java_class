package chap02.examples;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
//		long var3 = 100000000000000; // integer의 범위를 넘어섰는데 L을 붙이지 않아서 컴파일 에러가 발생 
		long var4 = 100000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
//		System.out.println(var3);
		System.out.println(var4);
	}
}
