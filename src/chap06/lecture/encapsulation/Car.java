package chap06.lecture.encapsulation;

public class Car {
	private int speed;  // 필드
	
	private int name; // 보통 코딩할 때 데이터 값은 private으로 두고
	private int model;  // 해당 데이터에 접근할 수 있는 메소드에 접근할 수 있는 방식으로 공개 
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	
	// 아래와 같이 get method, set method 등으로 작성해서 데이터에 접근할 수 있게 함
	// 읽기 전용으로 만들고 싶으면 set method를 지우고
	// 읽지는 못하고 셋만 하고싶으면 set method만 두고.. 이런식으로 코딩 
	
	
}
