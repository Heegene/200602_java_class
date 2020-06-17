package chap08.examples.sec080401;


import chap08.examples.sec080205.RemoteControl;
import chap08.examples.sec080301.Audio;
import chap08.examples.sec080301.Television;

public class RemoteControlExample {
	
	public static void main(String[] args) {
		
		RemoteControl rc = new Television(); 
	
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
	}

}
