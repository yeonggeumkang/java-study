package study01;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Service 
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		for (Method method : declaredMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				//메소드 이름 출력
				System.out.println("["+method.getName()+"]");
				//구분선 출력
				for(int i=0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				try {
					//메소드 호출
					method.invoke(new Service());
				} catch(Exception e) {
					System.out.println();
				}
			}
		}
	}

}
