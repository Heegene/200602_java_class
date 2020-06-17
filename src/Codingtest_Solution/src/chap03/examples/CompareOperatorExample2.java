package chap03.examples;

public class CompareOperatorExample2 {
	public static void main(String[] args) {
		
		int v2 = 1;
		double v3 = 1.0; // 1과 1.0은 잃어버릴게 없어서 어떻게 변환해도 별문제 없는데
		System.out.println(v2 == v3); // true
		
		double v4 = 0.1; // 64비트 / 문제는 0.1은 그 밑에가 완전히 딱 떨어지지 않음(2진법으로)
		float v5 = 0.1F; //32비트  / 비교하게되면 큰타입으로 변환되니까 더 정밀한쪽으로 
		// 
		System.out.println(v4 == v5); // false / double type으로 변환되는 순간 더 정밀하게 표현할 수 없어서 false
		System.out.println((float)v4 == v5); //true // 오히려 덜 정밀하게 하니 같다고 나옴
		System.out.println((int)(v4*10) == (int) (v5*10)); //true //해결하기위해 int로 변환해서 연산  
		
		
		
	}
}
