package chap11.lecture.wrapper;

import java.util.ArrayList;

public class WrapperClass {
	public static void main(String[] args) {
		// byte, short, int, long, float, double, char, boolean 8개의 primitive type
		// Byte, Short, Interger, Long (각각에 해당하는 참조타입인 클래스)
		// Float, Double, Character,Boolean  (각각에 해당하는 참조타입인 클래스)
		
		System.out.println(Integer.MIN_VALUE); // Integer 클래스 관련 메소드 
		System.out.println(Integer.MAX_VALUE);
		
		// equals. compareTo. max(둘 중 큰 값을 리턴) , parseInt(String 받아서 숫자로) 
		
		Integer i1 = new Integer(10); // 일반 primitive 형을 참조타입처럼 쓰려면 이렇게 new 참조타입화클래스명 으로 작성
		System.out.println(i1.MAX_VALUE);
		
		// ArrayList 배열과 비슷한데
		ArrayList<Integer> list = new ArrayList<> ();
		// 배열처럼 생긴 값을 저장할 수 있는 인스턴스 생성
		// list 는 arrayList 타입이므로 다른 인스턴스를 저장할 수 있음
		// 어떤 인스턴스만 저장할 수 있냐면  <> 안의 Integer 타입만 저장할 수 있음
		// 기본타입도 허용해줄 수 있으면 좋겠는데!
		//		Arraylist<int> list2 = new ArrayList<>(); // 기본타입은 허용이 안됨 
		// 인스턴스를 저장할 수 있는 인스턴스다보니까, 인스턴스 저장한다는게 참조타입 저장해야하는데 원시형은 참조값이 없음 
		//		근데 기본값도 저장할 수 있는 인스턴스가 필요해서 
		// 이전에는 기본타입에 해당하는 인스턴스를 만들어서 집어넣음
		list.add(new Integer(100)); // 이런식으로 새로 만들어서 넣었음
		// 이렇게 하는 걸 기본타입을 참조타입으로 박스에 넣었다고해서 박싱이라고함 (이때의 Integer가 포장 클래스)
		// 꺼낼때는
		Integer v = list.get(0); // 참조타입으로 넣었으니 꺼낼때는 참조타입으로 꺼내짐
		// 이걸 다시 일반 int로 바꿔줘야 하는데 이 과정을 언박싱이라고함
		int n = v.intValue(); // 이렇게 하고나서 n을 사용하면 그게 언박싱 과정
		// 매우 불편하고 번거로운데 이게 옛날버전에서 사용하던 방식 
		
		// 자동으로 하고 싶어서 
		list.add(200); // 이렇게 하면 박싱이 됨(오토 박싱)
		// 꺼낼때도 예전엔 참조타입으로 꺼내고 다시 언박싱하는 코드를 썼다면 이제는 바로 꺼냄
		int k = list.get(1); // 오토 언박싱 
		Integer i2 = 300; // 근데 이제는 걍 이렇게 자동으로 때려넣을수가 있음 
		int k2 = i2; // 타입에 민감해서 이렇게 타입변환이 되는 게 원칙적으로는 안 되는데 기본타입과 레퍼클래스간 자동 박싱 언박싱이 이루어지게 됨 
		
		method1(new Integer(100)); // 원래는 이렇게 해야하는데 메소드 안에 파라미터로 넣을 때도
		method1(100); // 그냥 기본타입 넣어도 오토박싱이 일어남 
		
	}
	
	public static  int method1(Integer i) {
		return i; // Integer 받아서 int로 반환하는것도 자동 언박싱 일어나서 가능 
	}
	

}
