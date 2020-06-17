package chap07.lecture.abstractMethod;

public class AbstractMethod {
	
	public static void main(String[] args) {
		
		KindaCat c1 = new Cat();
		c1.hide();
		c1.cry(); // 야옹 출력
		// 다형성에 의해 실제 인스턴스의 값이 출력됨 
	}

}
