package chap07.examples.sec070705;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child(); // 자식 객체를 부모 타입으로 변환 
		parent.field1 = "data1"; 
		parent.method1(); // parent method1 출력
		parent.method2(); // parent method2 출력
		
//		parent.field2 = "data2";
//		parent.method3();
		
		Child child = (Child) parent; // 참조타입 parent인상태라 쓸수없어서 강제변환 
		child.field2 = "yyy";
		child.method3(); // children method3 출력
		// 부모타입으로 된 걸 자식타입으로 강제전환
		
		
		
		
		
		
		
		
	}
}
