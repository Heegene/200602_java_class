package chap09.examples.sec090401;

public class Button {
	OnClickListener listner; // 인터페이스 타입 필드 
	
	void setOnClickListener(OnClickListener listener) { // 인터페이스 타입 파라미터
		this.listner = listener; // 매개 변수의 다형성 
	}
	
	void touch() {
		listner.onClick();
	}
	
	
	interface OnClickListener { // button 이라는 클래스 안에 있는 인터페이스 
		void onClick();
	}

}
