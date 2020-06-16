package chap08.examples.sec080402;


import chap08.examples.sec080205.RemoteControl;
import chap08.examples.sec080301.Television;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true); // default 메소드를 가지고있는데 
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true); 
		
		RemoteControl.changeBattery(); // 인터페이스 명으로 바로 접근해서 사용할 수 있음 
		
		
	}
}
