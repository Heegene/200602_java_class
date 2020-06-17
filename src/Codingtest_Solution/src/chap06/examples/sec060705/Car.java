package chap06.examples.sec060705;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed; 
	
	
	Car() {
		
	}
	
	
	Car(String model) {
		this(model, "은색", 250); // 파라미터 3개 받으면 color 은색으로 초기화됨 
		// 아래 파라미터 3개 받는 케이스의 this 호출해서 사용
		// 이렇게만 적어도 순서대로 모델, 색상, 맥스스피드 적용가능 
	}
	
	Car(String model, String color) {
		this(model, color, 250); // 아래 파라미터 3개 받는 케이스의 this 호출해서 사용
		// 이렇게만 적어도 순서대로 모델, 색상, 맥스스피드 적용가능 
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
}
