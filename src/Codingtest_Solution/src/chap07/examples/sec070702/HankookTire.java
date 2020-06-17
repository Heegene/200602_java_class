package chap07.examples.sec070702;

public class HankookTire extends Tire {
	
	// 필드
	
	
	// 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	
	// 메소드
	
	@Override
	public boolean roll() {
		++accuRotation;
		if(accuRotation < maxRotation) {
			System.out.println(location + "Hankook Tire 수명 : " + (maxRotation-accuRotation) + " 회");
			return true;
		} else {
			System.out.println("***" + location + " Hankook Tire  펑크 *** ");
			return false;
		}
	}

}
