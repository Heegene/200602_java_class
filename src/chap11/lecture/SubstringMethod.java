package chap11.lecture;

public class SubstringMethod {
	public static void main(String[] args) {
		//중간에서 문자열을 추출하는 메소드
		
		String str1 = "콩이갱얼쥐푸들갱얼쥐";
		String str2 = str1.substring(0,2);
		// 주의: 시작인덱스는 포함하지만 종료인덱스는 포함하지 않음
		// 0,2 라고 적으면 0,1 이렇게 두글자 리턴
		System.out.println(str2);
		
		System.out.println(str1.substring(4));
		// parameter를 하나만 적으면 n번 인덱스부터 끝까지 출력 
	}
}
