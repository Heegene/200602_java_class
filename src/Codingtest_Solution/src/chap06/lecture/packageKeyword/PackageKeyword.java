package chap06.lecture.packageKeyword;

public class PackageKeyword {
	public static void main(String[] args) {
		// package 키워드: 파일 맨 위에 해당 클래스의 패키지 위치를 작성
		// 패키지명 명명 규칙
		// lowerCamelCase or lower_snake_case
		// 회사별로 스타일가이드가 있으니 그걸 따라서 쓰면 됨
		// 변수명이나 클래스명 작성 시 쓸 수 있던 특수문자 $ _ 대소문자 숫자 이건 그대로
		// 다른 사람이 작성한 클래스를 사용하는 경우
		// 같은 패키지 안에는 같은 클래스 이름이 들어갈 수 없음
		// 클래스파일 이름이 겹친다면 다른패키지에 넣어야 함
		
		// 예시)
		// 내가 MyClass를 mypackage에 넣고
		// 다른 사람이 MyClass mypackage에 넣을 순 없음
		// 그렇게 패키지를 구분해서 받아올 때 사용하는 방식
		
		// 상위 패키지를 회사의 도메인 명(거꾸로)으로 사용
		// ex 삼성 직원과 LG 직원이 어떤 클래스를 만든다면
		// com.samsung.mypackage안에 넣고
		// LG면 com.lg.mypackage  이런식으로 사용해서 패키지 구분
		
		
		
		
	}
}
