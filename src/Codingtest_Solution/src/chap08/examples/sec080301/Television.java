package chap08.examples.sec080301;

import chap08.examples.sec080205.RemoteControl; // 리모트컨트롤이 다른패키지에 있으므로 임포트해서 사용

public class Television implements RemoteControl { //이렇게 implement 하는 클래스를 '구현' 클래스라고 함
	// 구현클래스라고도 하고 구체적으로 완성된 클래스라서 concrete class 라고도 함 
	
	private int volume;
	
	// turnOn(추상 메소드의 실제 메소드) 
	// 추상메소드를 다 구현해야 할 책임이 있음 구현을 안하게되면 abstract class로 바꿔야함 
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	// tufnOff(추상 메소드의 실제 메소드)
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	//setVolume의 실제 메소드
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("TV의 현재 볼륨 = " + this.volume);
	}
	

}
