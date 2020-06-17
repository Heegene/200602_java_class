package chap03.lecture.binary;

public class ComparisonWithRefType {
	public static void main(String[] args) {
		// 비교연산자와 참조타입이 사용되는경우
		// == !=
		// 피연산자가 참조타입을 받을 수 있음
		// 결과는 마찬가지로 boolean 으로 나옴
		
		// 참조타입은 값 자체가 아니라 실제 값은 따로 있고 데이터의 참조값만 가지고있어도 참조 타입
		
		String s1 = "자바";
		String s2 = "자바";
		String s3 = new String("자바");
		// Java라는 데이터를 가지고 있는 참조 값을 s1,s2,s3이 가지고잇음
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1 == s3); // false s1,s2는 literal한 string 값을 가지고있지만 s3은 자바라는 string을 갖고있는것
		
		System.out.println(s1 == s2); // true 
		System.out.println(s1.equals(s3)); //  true
		// 참조값이 아니라 "자바"라는 데이터가 같은지를 비교하고싶은건데 false로 뜨니까
		// equals 를 사용하여 비교하면 true가 반환됨 
		
		
	}
}
