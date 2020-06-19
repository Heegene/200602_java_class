package chap11.examples.sec110601;

import chap09.exercises.ex04.Car;

public class ClassExample {

	public static void main(String[] args) {

		Car car = new Car(); // 여기서 Car 클래스 정의한 거 없으므로 이전에 한 거 import 해서 쓰기
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();

		try {
			Class clazz2 = Class.forName("chap09.exercises.ex04.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
// 출력 결과
//		chap09.exercises.ex04.Car
//		Car
//		chap09.exercises.ex04
// 인스턴스를 통해 가져오나 forName으로 String으로 클래스 이름 적어주나 똑같이 가져올 수 있음 
//		chap09.exercises.ex04.Car
//		Car
//		chap09.exercises.ex04
		

	}

}
