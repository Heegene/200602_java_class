package chap09.exercises.ex06;

public class Chatting {
	
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		
		Chat chat = new Chat() { // 익명 객체 생성 
			@Override
			public void start() {
//				while(true) {
					String inputData = "안녕하세요";
					String message = "["+ nickName + "]" + inputData;
					sendMessage(message);
//				}
			}
		};
		chat.start();
		
	}
	
	
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}

}
