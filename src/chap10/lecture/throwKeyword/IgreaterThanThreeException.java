package chap10.lecture.throwKeyword;

public class IgreaterThanThreeException extends Exception {
	// checked Exception
	public IgreaterThanThreeException() {
	// 파라미터 있는것 없는것 이렇게 선택해서 만들어 줄 수 있음
		
	}
	
	public IgreaterThanThreeException(String messsage) {
		// 메세지 출력 안되는이유
//		super(); // 이게 생략되어 있는 형태임 현재 
//		그러므로 명시를 위해
		super(messsage);
	}
	

}
