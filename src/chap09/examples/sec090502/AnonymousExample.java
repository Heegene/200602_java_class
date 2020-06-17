package chap09.examples.sec090502;

public class AnonymousExample {
	public static void main(String[] args) {

		Anonymous ano = new Anonymous();

		// 익명 객체 필드 사용
		ano.field.turnOn(); // TV를 켭니다.

		// 익명 객체 로컬변수 사용
		ano.method1(); // Audio를 켭니다.

		// 익명 객체 매개값 사용
		ano.method2( // 메소드 정의에 파라미터가 리모트컨트롤타입이라 그 안에 새로 익명클래스로 정의해줌
				new RemoteControl() {
					@Override
					public void turnOn() {
						System.out.println("스마트TV를 켭니다.");
					}

					@Override
					public void turnOff() {
						System.out.println("스마트TV를 끕니다.");
					}
					// method2에 들어간 rc.turnOn()에 의해 스마트TV 켠다는 내용 출력 
				});

	}
}
