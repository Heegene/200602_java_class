package chap02.lecture.type;

public class LongType {
	public static void main(String[] args) {
		// long
		// 크기가 8byte(bit로는 64bit)
		// 최대값 9223372036854775807
		// 최소값 -9223372036854775808
//		long l = 9223372036854775807; 이렇게만 작성하면 오류남 
		long l = 9223372036854775807L;
//		integer의 최대값을 넣는건 되는데 integer의 최대 범위까지만 작성할 수 있음.
//		literal 값으로 integer 범위를 넘어서되 long type 의 범위 안에 들어가는 값을 적고 싶으면 끝에 l 붙여서 표시 
//		그리고 l의 경우 숫자 1과 비슷하므로 가급적 대문자 L로 적음 
		
		
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
	}

}
