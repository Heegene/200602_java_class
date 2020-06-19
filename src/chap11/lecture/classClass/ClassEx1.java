package chap11.lecture.classClass;

import java.lang.reflect.Method;

public class ClassEx1 {
	
	public static void main(String[] args) throws Exception {
		Class c1 = Class.forName("java.lang.String"); 
		// static method로, String으로 받은 클래스 이름의 인스턴스 리턴함
		// 그러면 필드는 뭐 생성자는 뭐 메소드는 뭐 이런정보를 갖게됨
//		c1.getFields();
		c1.getMethods(); // 메소드정보 가지고있는 인스턴스의 설계도가 Method[]
//		c1.getConstructors();
		String s = "";
		Class c2 = s.getClass();
		Class c3 = String.class;
		
		Method[] methods = c1.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
			
			
		}
// 출력 결과
// String이 가지고 있는 메소드 목록 출력
//		equals
//		toString
//		hashCode
//		compareTo
//		compareTo
//		indexOf
//		indexOf
//		indexOf
//		indexOf
//		valueOf
//		valueOf
//		valueOf
// 이하생략 

		
		
	}

}
