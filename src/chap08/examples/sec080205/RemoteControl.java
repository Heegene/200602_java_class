package chap08.examples.sec080205;

public interface RemoteControl {

	// 상수
	public int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 추상 메소드
	public void turnOn();

	void turnOff();

	public void setVolume(int volume);

	// 디폴트 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("음소거");
		} else {
			System.out.println("음소거 해제");
		}
	}

}
