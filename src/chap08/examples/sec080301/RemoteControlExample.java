package chap08.examples.sec080301;

import chap08.examples.sec080205.RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		Television rc1 = new Television();
		Audio rc2 = new Audio();
		
		rc1.turnOn();
		rc2.turnOff();

	}

}
