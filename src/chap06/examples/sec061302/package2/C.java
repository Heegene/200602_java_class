package chap06.examples.sec061302.package2;

import chap06.examples.sec061302.package1.A;

public class C {
	
	A a1 = new A(true); // o 
//	A a2 = new A(1); // x default 이므로 패키지 넘어가서 접근 불가
//	A a3 = new A("문자열"); // x private이므로 당연히 접근 불가 
	
}
