package study01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) //������̼��� �޼ҵ忡�� �����ϵ��� 
@Retention(RetentionPolicy.RUNTIME) //��Ÿ�� �ñ��� ������̼� ������ ����

public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
