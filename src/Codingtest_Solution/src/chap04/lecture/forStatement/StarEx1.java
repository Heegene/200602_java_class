package chap04.lecture.forStatement;

public class StarEx1 {

	public static void main(String[] args) {
		
// 별찍기 예제
// 출력 결과
//		*
//		**
//		***
//		****
//		*****	
	
	for (int i=0; i < 5; i++) {
		for (int j = 0; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
//별 개수가 줄어드는 별찍기 예제 
//******
//*****
//****
//***
//**
//*
	
	
	for (int i = 0; i <= 5; i ++) {
		
		for (int j = 5; j >= i; j--) {
			System.out.print("*");
		}
		System.out.println();
	}

//오른쪽에서부터 별이 늘어나는 예제
//     *
//    **
//   ***
//  ****
// *****
//******

	for (int i = 0; i <= 5; i ++) {
		
		for (int j = 5; j >= i; j--) {
			System.out.print(" ");
		}
		
		for (int j = 0; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
		
//왼쪽에서부터 별이 줄어드는 예제
//******
// *****
//  ****
//   ***
//    **
//     *

	
	for (int i = 0; i <= 5; i ++) {
		
		for (int j = 0; j <= i; j++) {
			System.out.print(" ");
		}
		
		for (int j = 5; j >= i; j--) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
}

}