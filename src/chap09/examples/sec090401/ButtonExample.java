package chap09.examples.sec090401;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch(); // onclick 실행하는 메소드 호출
		
		btn.setOnClickListener(new MessageListner());
		btn.touch(); 
	}

}
