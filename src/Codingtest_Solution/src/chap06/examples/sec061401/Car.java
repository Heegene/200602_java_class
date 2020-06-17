package chap06.examples.sec061401;

public class Car {
	
	private int speed;
	private boolean stop;
	
	
	
	public int getSpeed() { // 스피드값 반환
		return speed;
	}
	public void setSpeed(int speed) {  // 스피드가 0보다 작으면 (음수로 받으면)
		if(speed < 0) {
			this.speed = 0;  // 음수가 되지 않도록 0처리해줌
			return; // 반환
		} else {
		
		this.speed = speed; // speed 
		}
	}
	
	public boolean isStop() {
		return stop; // isStop 이면 stop boolean 값 반환 
		// boolean type 일 경우 get 써도 되고 is 써도 됨 
		
	}
	public void setStop(boolean stop) {
		this.stop = stop; 
		this.speed = 0; 
	}
	
	
	

}
