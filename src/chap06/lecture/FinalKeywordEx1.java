package chap06.lecture;

public class FinalKeywordEx1 {
	final static int m = 99; // 클래스 멤버이면서 값을 한번밖에 할당해줄 수 없는
	// 변경할 수 없는 값이 됨
	// 고정된 값을 정의할 때 사용 (ex pi는 3.14~~~ 라는 값이므로 변경할 일이 없으므로) 
	final static double PI = 3.141592; // 상수는 대문자로 작성하는 것이 관습 
	final static int MAX = Integer.MAX_VALUE; // 이것도 integer class에 정의된 static final 상수
	// snake case 이라고함 언더바로 대문자끼리 연결하는 타입 
	
	
	// final은 이곳저곳에 붙을 수 있음 메소드, 필드, 파라미터, 지역변수 등
	// final : 변수와 같이 사용하면 값을 한 번 할당할 기회를 갖는다. 한번"만!!"
	
	final int k = 0; // 인스턴스 필드에 final을 붙이는 경우 k는 0으로 고정
	final int l; // 이렇게 선언만 해 놓으면 컴파일 에러가 생김 인스턴스 필드를 초기화하는 코드가 생성자에 작성되는데
	// 생성자에서 값을 할당을 해줘야함 그 이후엔 할당 X
	
	FinalKeywordEx1() {
		this.l = 3; // 생성자에서 값 할당 
	}
	
	
	
	public static void main(final String[] args) { // parameter도 변수의 일종이므로 final String 이런식으로 쓸 수 있음
		// 필드도 변수임
		
		final int i = 0; // 값을 final 로 할당하면 새로운 값을 할당받지 못함
//		i = 1; 컴파일 에러
		
		final int j; // 먼저 선안하고 나서
		j = 3; // 이거 한번까지는 되는데(최초할당)
//		j = 4;  // 이거부터는 컴파일 에러남 
		
		
		
		
	}
	
}
