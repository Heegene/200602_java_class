package chap07.lecture.instanceofoperator;

public class InstanceOfOp {
	public static void main(String[] args) {
		
		// instanceof
		// 좌항 참조변수
		// 우항 타입명
		// 결과 boolean
		
		
		SuperClass c1 = new SubClass1();
		SuperClass c2 = new SubClass2();
		
		System.out.println(c1 instanceof SuperClass); // true
		// c1이 가리키고 있는 인스턴스가 SuperClass 이면 true를 반환
		System.out.println(c1 instanceof SubClass1); // true
		System.out.println(c1 instanceof SubClass2); // false 가 나옴
		
		// 강제 형변환 하기 전에 if else를 하고
//		맞는 경우에만 형변환 강제로 하도록 하는 것이 좋음 
		if (c1 instanceof SubClass2) {
			SubClass2 s1 = (SubClass2) c1;
		}
		if (c2 instanceof SubClass2) {
			SubClass2 s2 = (SubClass2) c2;
		}
		
		
		// 강제형변환
		SubClass2 s1 = (SubClass2) c1; // 오타를 내서 1번이아니라 2번이라고 적었다 치면 
		// 컴파일 에러는 안뜨는데 대신 중간에 에러나게됨...
		// 이를 방지하기 위한 연산자 instanceof
		SubClass2 s2 = (SubClass2) c2;
		
		System.out.println("프로그램이 정상 종료");
		
		
		
		
	}
}
