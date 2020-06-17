package chap09.examples.sec090502;

public class Button {
	
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener; // listener는 OnclickListener 인터페이스 타입 
	}
	
	void touch() {
		listener.onClick(); // touch 적용시 listener 의 onclick 사용 
	}

	interface OnClickListener {
		void onClick(); // 추상 메소드 onclick 
	}
}
