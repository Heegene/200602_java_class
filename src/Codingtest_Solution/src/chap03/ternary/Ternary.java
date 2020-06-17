package chap03.ternary;

public class Ternary {
	public static void main(String[] args) {
		// 삼항연산자
		// ? : 으로 이루어짐 
		// 항이 3개  - 항1 ? 항2 : 항3
		// 결과값은 항2 or 항3
		
		// 항1이 true이면 항2가 결과로 나타남
		// 항1이 false이면 항3이 결과로 나타남
		System.out.println(true ? 3:4); // 3
		System.out.println(false ? 3 : 4); // 4 
		
		System.out.println((3 < 2) ? 'a' : 'b' );
		System.out.println((10 % 2 == 0 ) ? false : true);
		
		
	}
}
