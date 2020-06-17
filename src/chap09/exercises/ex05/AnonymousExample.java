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
		
		

	}

}
