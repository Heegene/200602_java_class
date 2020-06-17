package chap11.lecture;

public class IndexOfMethod {
	public static void main(String[] args) {
		
		String str1 = "우리갱얼쥐푸들갱얼쥐";
		// indexOf는 parameter로 받은 문자 열이 어디에 등장하는지 보여줌
		int i = str1.indexOf("갱얼쥐"); //indexOf는 int로 반환되므로 int에 담음
		System.out.println(i);
		// 같은값이 여러 번 존재하면 첫 번째 값만 리턴함
		
		
		// 뒤에서부터 찾고싶다면 lastIndexOf
		int i2 = str1.lastIndexOf("갱얼쥐");
		System.out.println(i2);
		
		//찾을 수 없는 경우 -1 리턴
		int i3 = str1.indexOf("갱얼스"); 
		System.out.println(i3); // -1이 리턴됨 
	}
}
