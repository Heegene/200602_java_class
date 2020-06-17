package chap11.lecture;

public class ReplaceMethod {
	public static void main(String[] args) {
		
		// 원래 가지고 있는 String값을 바꿔서 리턴
		String str1 = "콩이갱얼쥐푸들갱얼쥐";
//		str1.replace("푸들", "Poodle"); // 바뀐걸 리턴만 할뿐 저장은 하지 않음
		// 따라서 저장해서 사용하기 위해서는 재할당 필요
		
		String str2 = str1.replace("푸들", "Poodle");
		//동일한 값 있을 경우 싹다 바꿈 
		
		System.out.println(str2);
	}
}
