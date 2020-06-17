package chap07.examples.sec070502;

public class Car {
	
	public int speed;
	
	public void SpeedUp() { speed ++;}

	public final void stop () {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
