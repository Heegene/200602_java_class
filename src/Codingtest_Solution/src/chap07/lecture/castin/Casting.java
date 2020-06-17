package chap07.lecture.castin;

public class Casting {
	public static void main(String[] args) {
		
		SuperClass c = new SubClass();
		SubClass b = c; // 역으로 형변환
		// 강제로 형변환하는 방법 있음
		SubClass b = (SubClass) c; 
		// 강제 형변환해서 쓰기 
		b.method(); 
		
	}
}
