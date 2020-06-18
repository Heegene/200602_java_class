package chap10.lecture.throwsKeyword;

import java.rmi.activation.ActivationException;

public class ThrowsEx1 {
	public static void main(String[] args) throws ClassNotFoundException { // 메인에서도 throws 가능.. 
		// main method 에서도 떠넘기면 결국 그 책임을 JVM이 맡게 되어 프로그램 종료가 됨 
		// 프로그램 종료가 목적이 아니라면 try catch 로 잡아서 써야함 
		System.out.println("메인 메소드 시작");
		method1(); // 또 처리 책임이 여기로 넘어옴 
		System.out.println("메인 메소드 종료");
	}
	
	private static void method1() throws ClassNotFoundException {
		System.out.println("메소드1 시작");
		method2(); // method2에도 그렇게 해주면 또 책임을 위로 받게 됨 
//		ctrl 1 눌러보면 try catch 로 잡든 throws로 하든 둘중하나하라고 나옴 
		System.out.println("메소드1 종료"); 
	}
	
	private static void method2() throws ClassNotFoundException {
		System.out.println("메소드2 시작");
		
		method3(); // 메소드3을 호출한 여기로 올라가서
	
		
		System.out.println("메소드2 종료"); 
	}
	
	private static void method3() throws Exception {
		System.out.println("메소드3 시작");
		Class.forName("java.lang.String2");
		System.out.println("메소드3 종료");
	}
}
