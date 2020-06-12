package chap07.lecture.polymorphism;

public class PolyMorphism {
	public static void main(String[] args) {
		// 인스턴스는 new Cat() 이고 c는 참조변수임
		Cat c = new Cat();
		
		KindaCat k1; // KindaCat이라는 참조변수가 타입이 되는 k1이라는 참조변수 만들기
		k1 = c; // 서로 다른 타입인데 값을 넣을 수 있었음
		// 왜냐면 다형성이 적용되므로. 집고양이는 고양이과 이므로!
		
		Tiger tiger1 = new Tiger();
		
		KindaCat k2;
		
		k2 = tiger1; // 이렇게도 가능함 호랑이는 고양이과를 상속받았으므로. 
		
		KindaCat k3 = new Cat();
		KindaCat k4 = new Tiger();
		
		// 반대의 상황은 안됨
		
//		cat1 = k1; // 고양이과는 고양이가 아니니까 안됨 컴파일 에러
//		tiger1 = k2; // 고양이과는 호랑이가 아니니까 안됨
		// 상위 클래스로만 타입 변환이 가능함 
		
		System.out.println(k1 == c); // true 출력 참조값은 다르지만 인스턴스는 4개 
		System.out.println(k2 == tiger1); // true 출력 
		
		
		
		
		
	}
}
