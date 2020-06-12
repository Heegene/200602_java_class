package chap07.lecture.polymorphism.sample3;

public class MyApp {
	public static void main(String[] args) {
		
		Phone phone = new Phone();
		phone.setLense(new LenseSamsung());
		phone.selfie(); 
		
		phone.setLense(new LenseLG());
		phone.selfie();
		
	}
}
