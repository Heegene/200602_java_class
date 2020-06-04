package chap03.lecture.binary;

public class AssignmentOperator {
	public static void main(String[] args) {
		// =  += -= *= /= %= 
		// &= |= ^= 
		// <<= >>= >>>=
		int i = 3;
		i += 5;
		// i에 5를 더해서 대입
		System.out.println(i);
		
		i <<=1;
		System.out.println(i); // 2를곱한것과 같으므로 16 
	}
}
