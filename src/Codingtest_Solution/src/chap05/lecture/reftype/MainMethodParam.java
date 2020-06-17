package chap05.lecture.reftype;

public class MainMethodParam {
	public static void main(String[] args) {
		
		System.out.println(args.length);
		// null pointer exception이 뜨지않는걸보면 뭔가 전달된 게 있는것
		// 배열의 각 원소는 string타입이 될 수 있는데
		System.out.println(args[0]);
		System.out.println(args[1]);
		// 
	}
}
