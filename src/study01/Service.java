package study01;

public class Service {
	
	@PrintAnnotation
	public void method1() {
		System.out.println("실행내용1");
	}
	
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("실행내용2");
	}
	
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("실행내용3");
	}
	
	public void method4() {
		System.out.println("실행내용4");
	}
	
	public static void main(String[] args) {
		Service s = new Service();
		s.method1();
		s.method2();
		s.method3();
		s.method4();
	}
}
