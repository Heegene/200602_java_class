package chap05.lecture;

public class RefTypeEquals {
	public static void main(String[] args) {
		String str1 = new String("java");
		// new와 새로운 타입 지정하면 새로운 인스턴스가 만들어짐 
		
		String str2 = new String("java"); 
		
		// 2개의 인스턴스가 만들어짐
		
		// s1 라는 스택공간에 874 주소저장되고
		// heap 영역에 "java" 라는 874 인스턴스 생성
		// s2는 할당연산자에의해 963 주소값 갖고
		// 힙영역에 "java" 가진 연산 생겨남
		
		System.out.println(str1 == str2);
		// 이렇게하면 다른 참조값을 사용하므로 false 리턴됨
		
		// 내용물 비교하고싶으면 equals 메소드 사용해야함
		System.out.println(str1.equals(str2)); // true 됨 
		
		
		
	}
}
