package chap06.examples.sec061504;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) // 메소드에만 붙일수있고 
@Retention(RetentionPolicy.RUNTIME) // 컴파일 한 이후에도 바이트코드, 그냥 코드에도 남도록 지정


public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
	

}
