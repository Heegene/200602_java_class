package chap08.examples.sec080402;

import chap08.examples.sec080205.RemoteControl;

public class Audio implements RemoteControl  {

	private int volume;
	private boolean mute; 
	
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("Audio 의 현재 볼륨 = " + this.volume);
	}
	
	@Override 
	public void setMute(boolean mute) { // RemoteControl의 디폴트 메소드를 재정의함 
		this.mute = mute;
		if (mute) {
			System.out.println("음소거");
		} else {
			System.out.println("음소거 해제");
		}
	}
	
}
