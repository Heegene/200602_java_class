//  다른 패키지에 있는 클래스를 쓰고 싶을때

package chap06.examples.sec061204.mycompany;
import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*; 

import chap06.examples.sec061204.hankook.SnowTire;
import chap06.examples.sec061204.hankook.Tire;
import chap06.examples.sec061204.kumho.BigWidthTire;

import static java.lang.Math.random; 


public class Car {
	chap06.examples.sec061204.hyundai.Engine engine 
	= new chap06.examples.sec061204.hyundai.Engine();// 참조변수의 타입을 이렇게 적어줘야 가능
	
	// 근데 너무 번거로움 이전에 같은패키지에있는파일끼리 쓸땐 편했는데 . . 
	
	// 그래서 SnowTire를 편하게 쓰고싶다면 import 기능 사용
	SnowTire snowtire; 
	BigWidthTire bwt = new BigWidthTire();
	
	// import를 자동으로 찾아서 넣고 싶으면 ctrl + shift + o 
	
	Tire tire1 = new Tire(); // 그것도 Tire라는 이름이 여러 클래스에 중복해서 충돌하는 경우
	// 한쪽은 이름을 풀네임으로 작성해 주어야 함 
	chap06.examples.sec061204.kumho.Tire tire2 = new chap06.examples.sec061204.kumho.Tire();
	
	Scanner sc = new Scanner(System.in) ;
	
	List list; 
	
//	
//	import가 생략 가능한 패키지 - java.lang 에 있는 패키지는 임포트 없이 사용 가능
//	java.lang에는 class, boolean, float, Enum 등등.. API 문서에서 java.lang에서 보면 됨
//  Math 클래스도 마찬가지 
	
}
