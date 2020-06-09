package chap06.examples.sec060703;

public class KoreanExample {
	public static void main(String[] args) {
		
		Korean k1 = new Korean("이콩이", "011225-1234567");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		
		Korean k2 = new Korean("충북이", "930525-065321");
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}
}
