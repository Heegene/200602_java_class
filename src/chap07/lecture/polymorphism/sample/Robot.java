package chap07.lecture.polymorphism.sample;

public class Robot {
	
	private Foot foot; // 어ㅕ기서 Foot은 클래스임
	
	public void setFoot(Foot foot) {
		this.foot = foot;
	}
	
	public void go() {
		foot.action();
		
	}
}
