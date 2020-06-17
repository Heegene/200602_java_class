package chap07.lecture.polymorphism.sample;

public class MyApp {
	public static void main(String[] args) {
		
		Robot r = new Robot();
		r.setFoot(new RocketFoo()); // normalfoot으로 변경하면 걸어갑니다 나오고.. 간단하게 이 rocketfoot 이런식으로 인스턴스만 교체해주면됨
		// 그렇게 하면 전체 프로그램에서의 내용이 바뀜
		
		
		r.go();
		

	}
}
