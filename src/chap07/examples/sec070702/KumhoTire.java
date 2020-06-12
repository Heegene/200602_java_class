package chap07.examples.sec070702;

public class KumhoTire extends Tire {

	// 필드
	
	
		// 생성자
		public KumhoTire(String location, int maxRotation) {
			super(location, maxRotation);
		}
		
		
		// 메소드
		
		@Override
		public boolean roll() {
			++accuRotation;
			if(accuRotation < maxRotation) {
				System.out.println(location + "Kumho Tire 수명 : " + (maxRotation-accuRotation) + " 회");
				return true;
			} else {
				System.out.println("***" + location + " Kumho Tire  펑크 *** ");
				return false;
			}
		}

	}

	
