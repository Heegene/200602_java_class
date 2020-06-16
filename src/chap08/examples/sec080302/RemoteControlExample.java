package chap08.examples.sec080302;

import chap08.examples.sec080205.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl rc = new RemoteControl() { // Remotecontrol의 익명 구현 객체 생성 
			// 클래스 없이 인스턴스를 만든 상황
			
			@Override
			public void turnOn() {};
			
			@Override
			public void turnOff() { };
			
			@Override 
			public void setVolume(int volume) { };
			
		};
	}
}
