package chap09.examples.sec090502;

public class Window {
	Button button1 = new Button(); // 버튼 클래스 이용하여 인스턴스 객체 생성
	Button button2 = new Button();
	
	// 필드 초기값으로 대입 
	Button.OnClickListener listener = new Button.OnClickListener() { // Button.OnclickListner는 필드니까 필드값을 새로 만들어서 설정
		
		@Override 
		public void onClick() { // 설정하면서 오버라이딩 전화를 겁니다로 변경 
			// TODO Auto-generated method stub
			System.out.println("전화를 겁니다.");
			
		}
	};
	
	Window() {
		button1.setOnClickListener(listener); //  button1은 setOnClickListener의 메소드 사용하여 앞서 정의한 listener가 
		// listener에 저장되도록 함 
		button2.setOnClickListener(new Button.OnClickListener() { // 이건 기존값 저장 안하고 새로 만들었음 
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("메세지를 보냅니다.");
			}
		});
		
	}
}
