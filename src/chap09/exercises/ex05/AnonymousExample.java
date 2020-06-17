package chap09.exercises.ex05;

public class AnonymousExample {
	public static void main(String[] args) {
		
		Anonymous ano = new Anonymous();
		ano.field.run();
		ano.method1();
		ano.method2(new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
		}
				
				);
		
		// lamda 식 표현(java)
		ano.method2(() -> System.out.println("버스가 달립니다"));
		// javascript에서는 arrow-function 이라고 해서 이런식으로 사용
		
		
	}

	
}
