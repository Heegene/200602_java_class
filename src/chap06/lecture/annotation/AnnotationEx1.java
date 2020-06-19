package chap06.lecture.annotation;

@MyAnnotation(name="hello", id=3, numbers= {1,2,3})
public class AnnotationEx1 {
//	@MyAnnotation 
	int field; // 필드 사용불가됨
	
//	@MyAnnotation
	public AnnotationEx1 () { // 생성자 사용불가됨 
		
	}
	
	@MyAnnotation(name="hello", id=3, value="K")
	// value의 경우 @MyAnnotation(k) 이렇게 생략 가능함
	// 그런데 다른 element와 같이 사용될 때에는 k 이렇게만 생략할 수 없음 
	public void method() { // 메소드 사용가능
		
	}
	
//	@MyAnnotation 
//	public void method(@MyAnnotation int k) { // parameter 사용불가됨 
		
	}

