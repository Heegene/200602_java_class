package chap06.lecture.constructor;

public class ConstructorEx2 {
	public static void main(String[] args) {

		MyClass o1 = new MyClass("애기갱얼"); // () 안에 넣어주면 컴파일러가 알아서 parameter를 사용하는 걸로 매칭해줌

		System.out.println(o1.name);
		System.out.println(o1.number);
		// 생성자를 사용할 때 초기값을 변동하고 싶으면 argument로 줘서 변경

		MyClass o2 = new MyClass("댕댕"); // () 안에 넣어주면 컴파일러가 알아서 parameter를 사용하는 걸로 매칭해줌

		System.out.println(o2.name);
		System.out.println(o2.number);
		
		MyClass o3 = new MyClass(60, "콩얼");   

		System.out.println(o3.name); // 콩얼 출력
		System.out.println(o3.number); // 60 출력 
	}
}
