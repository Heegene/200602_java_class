package chap09.exercises.ex06;

public class Chatting {
	
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		
		Chat chat = new Chat() { // 익명 객체 생성 
			
			
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "["+ nickName + "]" + inputData;
					// nickName 컴파일에러가 나는이유
					// 닉네임이 final이나 effectively final이 아니라서
					// local class인데 local 변수를 사용할 때 final 또는 effectively final이어야 함
					
					sendMessage(message);
				}
			}
		};
		chat.start();
		
	}
	
	
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}

}
