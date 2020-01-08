package study01;

public class Service {
	
	@PrintAnnotation
	public void method1() {
		System.out.println("���೻��1");
	}
	
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("���೻��2");
	}
	
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("���೻��3");
	}
	
	public void method4() {
		System.out.println("���೻��4");
	}
	
	public static void main(String[] args) {
		Service s = new Service();
		s.method1();
		s.method2();
		s.method3();
		s.method4();
	}
}
