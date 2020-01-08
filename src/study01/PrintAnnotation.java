package study01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) //어노테이션을 메소드에만 적용하도록 
@Retention(RetentionPolicy.RUNTIME) //런타임 시까지 어노테이션 정보를 유지

public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
