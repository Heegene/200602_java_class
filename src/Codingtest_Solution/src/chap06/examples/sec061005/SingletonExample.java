package chap06.examples.sec061005;

public class SingletonExample {
	public static void main(String[] args) {
		
		
//		 Singleton obj1 = new Singleton(); // 각각 다른 singleton 객ㅊ
//		 Singleton obj2 = new Singleton(); // 서로 다른 인스턴스 이니까 컴파일 오류 
		 
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		 
		if (obj1 == obj2) { // 인스턴스가 하나밖에 만들어지지 않았으므로 같은 싱글톤 객체를 갖게 됨 
			System.out.println("같은 Singleton 객체입니다.");
			
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
	}
}
