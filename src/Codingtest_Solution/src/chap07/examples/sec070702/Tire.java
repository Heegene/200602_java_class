package chap07.examples.sec070702;

public class Tire {
	// 필드
	public int maxRotation;
	public int accuRotation;
	public String location; 
	
	
	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location; // 입력받은 값으로 초기화
		this.maxRotation = maxRotation; // 마찬가지
	}
	
	// 메소드
	public boolean roll() {
		 ++accuRotation;
		 if (accuRotation < maxRotation) {
			 System.out.println(location + "타이어 수명 " + (maxRotation-accuRotation) + " 회");
			 return true;
		 } else {
			 System.out.println(" *** " + location + " 타티어 펑크 ***");
			 return false;
		 }
	}
	

}
