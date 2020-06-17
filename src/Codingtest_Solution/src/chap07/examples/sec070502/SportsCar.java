package chap07.examples.sec070502;

public class SportsCar extends Car{
	@Override
	public void speedUp() {speed += 10; }
	
	// 오버라이딩을 할 수 없음(final선언했으므로)
	@Override
	public void stop() { // 컴파일 에러 발생 
		System.out.println("스포츠카를 멈춤");
		speed = 0; 
	}
	
}
