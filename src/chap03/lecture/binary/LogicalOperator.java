package chap03.lecture.binary;

public class LogicalOperator {
	public static void main(String[] args) {
		// && (and) || (or) 
		// 피연산자가 boolean type
		// 결과도 boolean type
		
		System.out.println("and"); // 논리곱
		System.out.println(true && true); // 이것처럼 양 변이 true 인 경우만 true
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false); 
		
		System.out.println("or"); // 논리합
	
		System.out.println(true || true);  // true
		System.out.println(true  ||  false); // true
		System.out.println(false  || true); // true
		System.out.println(false  || false);  // false 
		
		System.out.println("xor"); // 배타적 논리합
		System.out.println(true ^ true); 
		System.out.println(true ^ false); // 양 변이 다른 경우만 true
		System.out.println(false ^  true); // true
		System.out.println(false ^  false); 
		
		System.out.println("&"); // 이것도 마찬가지로 양 변이 true.일 때만 true (and랑 같음)
		System.out.println(true  &true); 
		System.out.println(true  &false);
		System.out.println(false & true);
		System.out.println(false & false); 
		
		System.out.println("|"); // 이렇게 하나붙은것도 똑같은 or 양변이 false일때만 false고 나머지 true 
		
		System.out.println(true | true);  // true
		System.out.println(true | false); // true
		System.out.println(false| true); // true
		System.out.println(false| false);  // false 
		
		// 하나만 있어도 같다면 || 랑 |, && 랑 & 의 차이는?
		// 
		int i = 5;
		int j = 7;
		System.out.println((i > 0) && (j > 5)); // true
		System.out.println((i <0) && (j++ > 5)); // 양변이 true일때만 true 니까 한쪽은 false
		System.out.println(j); //7
		// 앞에꺼가 false이면 뒤에껄 검사하지 않아도 false가 뜰거란걸 알게 됨 
		// 그래서 &&는 첫번째조건이 false면 뒤에꺼 검사 자체를 안함
		System.out.println((i <0) & (j++ > 5)); // & 하나붙은건 뒤에꺼 true든 false든 반환엔 차이 없지만 연산을 끝까지 함 
		System.out.println(j);// 그래서 j값이 바뀜  8
		
		// 그래서 &&을 short circuit 이라고함 
		
		                        
	}
}

