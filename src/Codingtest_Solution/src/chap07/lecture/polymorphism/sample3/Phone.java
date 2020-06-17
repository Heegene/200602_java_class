package chap07.lecture.polymorphism.sample3;

public class Phone {
	private Lense lense;
	
	public void setLense(Lense lense) {
		this.lense = lense;
	}
	
	public Lense selfie() {
		return lense.feature();
	}
	
}
