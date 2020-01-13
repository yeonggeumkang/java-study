package study01.ch7;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child; //자동 타입 변환됨. parent는 Child의 객체.
		
		parent.method1();
		parent.method2();
//		parent.method3(); - 이건 호출 불가능
		
	}
}
