package chap06.lecture.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 어디에만 붙일 수 있는지 정할 수 있음

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME) // 프로그램이 실행하는 동안에도 살아 있음 
public @interface MyAnnotation {
	
	String name(); // 메소드 작성하듯이 작성하면 됨
	// 이렇게 하면 name이라는 값을 String 으로 받을 수 있음 
	// @MyAnnotation(name="hello")
	
	// default값을 줄 수도 있음
//	String name() default "hello";
	// 그러면 name값 명시하지 않으면 default 값이 hello가 됨
//	이렇게 값을 넘겨주는 element는 0개 이상 있을 수 있음 
	int id() default 0; 
	int[] numbers() default {0,1,2,3,4};
	String value() default "v"; // 그 중 value라는 이름 가진 element는 

}
