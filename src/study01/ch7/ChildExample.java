package study01.ch7;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child; //�ڵ� Ÿ�� ��ȯ��. parent�� Child�� ��ü.
		
		parent.method1();
		parent.method2();
//		parent.method3(); - �̰� ȣ�� �Ұ���
		
	}
}
