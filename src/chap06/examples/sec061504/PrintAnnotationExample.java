package chap06.examples.sec061504;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {

		// Service 클래스로부터 메소드 정보 얻음
//		Method[] declaredMethods = Service.class.getDeclaredMethods();
		//이걸 두줄로 나누면
		Class c1 = Service.class; // Service로부터 class 정보를 받아온것 getClass() 대신
		Method[] declaredMethods = c1.getDeclaredMethods(); 
		
		

		// MEthod 객체 하나씩 처리
		for (Method method : declaredMethods) {
			// PrintAnnotation이 적용되었는지 확인
			if (method.isAnnotationPresent(PrintAnnotation.class)) { // 어떤 Annotation이 있는지 Annotation의 class 정보 넣어줌 
				// PrintAnnotation 이라는 annotation 가지면 true가 되므로 전체가 true에 해당 
				// PrintAnnotation 객체 얻기
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

				// 메소드 이름 출력
				System.out.println("[" + method.getName() + "]");
				// 구분선 출력
				for (int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}

				System.out.println();

				try {
					// 메소드 호출
					method.invoke(new Service());
				} catch (Exception e) {
					System.out.println();
				}

			}

		}
	}

}
